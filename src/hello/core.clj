(ns hello.core
  (:use [org.httpkit.server :only [run-server]]
        [compojure.core :only [defroutes GET POST]]
        [compojure.handler :only [site]])
  (:require [ring.middleware.reload :as reload]
            [compojure.route :as route])
  (:gen-class))

(defn in-dev?
  [args]
  true)

(defroutes all-routes
  (GET "/" [] "Hello World!")
  (route/not-found "<p>Page not found.</p>")) ;; all other, return 404

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!")
  (let [handler (if (in-dev? args)
                  (reload/wrap-reload (site #'all-routes)) ;; only reload when dev
                  (site all-routes))
        _ (run-server handler {:port 8080})]))