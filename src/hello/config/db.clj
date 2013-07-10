(ns hello.config.db
  (:use [korma.db :only (defdb postgres)]
  	     [hello.config.config]))

(defdb prod (postgres {:db (str (:dbname postgres-config))
                       :user (str (:user postgres-config))
                       :password (str (:password postgres-config))
                       ;; optional keys
                       :host (str (:host postgres-config))
                       :port (Long. (:port postgres-config))
                       :delimiters (str (:delimiters postgres-config))})) ;; delimiters