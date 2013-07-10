(defproject test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.2.0"]                               ;; base
                 [com.cemerick/friend "0.1.5"]                ;; authentication (must be before compojure)
                 [compojure "1.1.5"]                          ;; routing
                 [enlive "1.1.1"]                             ;; template
                 [korma "0.3.0-RC5"]                          ;; database access
                 [org.postgresql/postgresql "9.2-1002-jdbc4"] ;; PostgreSQL driver
                 [http-kit "2.1.6"]                           ;; asynchronous HTTP
                 [ritz/ritz-nrepl-middleware "0.7.0"]]        ;; debugging
  :main hello.core
  :plugins [[lein-daemon "0.5.4"]
            [lein-ring "0.8.6"]
            [lein-ritz "0.7.0"]]
  :repl-options {:nrepl-middleware
                  [ritz.nrepl.middleware.javadoc/wrap-javadoc
                   ritz.nrepl.middleware.simple-complete/wrap-simple-complete]}
  :resource-paths ["lib/*", "resources"]
  :ring {:handler hello.core/app}
  :daemon {:hello {:ns hello.core
                   :pidfile "hello.pid"}}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}})