(ns hello.config.db
  (:use [korma.db :only (defdb postgres)]))

(defdb prod (postgres {:db "test"
                       :user "postgres"
                       :password "123456"
                       ;; optional keys
                       :host "127.0.0.1"
                       :port "5432"
                       :delimiters ""}))
                       ;; remove delimiters