(ns hello.routes
  (:use [compojure.core :only [defroutes]])
  (:require [compojure.route :as route]
            [hello.controllers.index :as index]))

(defroutes all-routes
  index/routes
  (route/not-found "<p>Page not found.</p>")) ;; all other, return 404