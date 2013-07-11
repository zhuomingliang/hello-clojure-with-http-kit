(ns hello.views.index
  (:use [net.cgrand.enlive-html :only [deftemplate content]]
        [hello.views.comments]))


(deftemplate render
  "hello/views/index.html"
  [comments]

  [:body]
  (content comments))