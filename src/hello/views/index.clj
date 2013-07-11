(ns hello.views.index
  (:use [net.cgrand.enlive-html :only [deftemplate content]]))


(deftemplate render
  "hello/views/index.html"
  [comments]

  [:body]
  (content comments))