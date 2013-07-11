(ns hello.views.comments
  (:use [net.cgrand.enlive-html]))

(defsnippet comments-snippet
  "hello/views/comments.html" [:table]
  [comments]

  [:tr]
  (clone-for [i (range (count comments))]
  	[:td any-node]
    (replace-vars (dissoc (get comments i) :id))) ;; use id with number will lead to java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.String
  )