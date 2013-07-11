(ns hello.controllers.index
  (:use [compojure.core :only [defroutes GET]]
  	    [hello.views.index :only [render]]))

(defn- show []
  (render))

(defroutes routes
  (GET "/" [] (show)))