(ns hello.views.index
  (:use [net.cgrand.enlive-html]))

(defn render []
  (apply str (-> "hello/views/index.html"
    (html-resource)
    (transform [] [])
    (emit*))))