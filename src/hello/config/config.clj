;; From http://stackoverflow.com/questions/7777882/loading-configuration-file-in-clojure-as-data-structure

(ns hello.config.config
  (:use [clojure.java.io]))

(defn- load-props
  [file-name]
  (with-open [^java.io.Reader reader (clojure.java.io/reader file-name)]
    (let [props (java.util.Properties.)]
      (.load props reader)
      (into {} (for [[k v] props] [(keyword k) (read-string v)])))))

(def postgres-config (load-props (resource "postgres.properties")))