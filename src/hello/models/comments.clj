(ns hello.models.comments
  (:use [korma.core :only [defentity select]]
        [hello.config.db]))

(defentity comments)

(defn find-all []
  (select comments))