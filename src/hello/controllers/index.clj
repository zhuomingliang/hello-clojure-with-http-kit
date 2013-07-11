(ns hello.controllers.index
  (:use [compojure.core :only [defroutes GET]]
        [hello.views.comments])
  (:require [compojure.route :as route]
            [hello.views.index :as index]
            [hello.models.comments :as Comment]))

(defn- render []
  (let [comments (Comment/find-all)]
  	(comments-snippet comments)))

(defroutes routes
  (GET "/" [] (index/render (render))))