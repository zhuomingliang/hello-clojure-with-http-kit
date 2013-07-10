(defproject test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.2.0"]                               ;; Base
                 [com.cemerick/friend "0.1.5"]                ;; Authentication (must be before compojure)
                 [compojure "1.1.5"]                          ;; Routing
                 [lib-noir "0.6.6"]                           ;; Validation, Session
                 [com.taoensso/tower "2.0.0-alpha13"]         ;; I18n
                 [enlive "1.1.1"]                             ;; Template
              ;; [hiccup "1.0.3"]                             ;; Template
                 [korma "0.3.0-RC5"]                          ;; Database access
                 [org.postgresql/postgresql "9.2-1002-jdbc4"] ;; PostgreSQL driver
              ;; [mysql/mysql-connector-java "5.1.6"]         ;; MySQL driver
                 [me.raynes/fs "1.4.5"]                       ;; File system utilities
                 [http-kit "2.1.6"]                           ;; Asynchronous HTTP
                 [ritz/ritz-nrepl-middleware "0.7.0"]]        ;; Debugging
                 [ring.middleware.logger "0.4.1"]             ;; Ring middleware to log each request using Log4J
  :main hello.core
  :plugins [[lein-daemon "0.5.4"]
            [lein-ring "0.8.6"]
            [lein-ritz "0.7.0"]]
  :repl-options {:nrepl-middleware
                  [ritz.nrepl.middleware.javadoc/wrap-javadoc
                   ritz.nrepl.middleware.simple-complete/wrap-simple-complete]}
  ;; :resource-paths ["lib/*", "resources"]
  :ring {:handler hello.core/app}
  :daemon {:hello {:ns hello.core
                   :pidfile "hello.pid"}}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}})