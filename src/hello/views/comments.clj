(ns hello.views.comments
  (:use [net.cgrand.enlive-html :only [defsnippet clone-for]]))

(defsnippet comments-snippet
  "hello/views/comments.html" [:table]
  [comments]

  [:tr]
  (clone-for [i (range (count comments))]
  	[:content]
  	"hello"
  ))