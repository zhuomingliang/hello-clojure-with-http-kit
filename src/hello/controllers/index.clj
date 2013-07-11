(ns hello.controllers.index
  (:use [compojure.core :only [defroutes GET]]
        [hello.views.snippets.comments])
  (:require [hello.views.index :as index]
            [hello.models.comments :as Comment]))

(defn- render []
  (let [comments [{:id 1 :author "James" :message "hello JimmyZ"} {:id 2 :author "JimmyZ" :message "aloha James"}]] ;; for testing
;;(let [comments (Comment/find-all)]
  	(comments-snippet comments)))

(defroutes routes
  (GET "/" [] (index/render (render))))