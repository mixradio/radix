(defproject mixradio/radix "1.0.21-SNAPSHOT"
  :description "A Clojure library providing the root functionality for web services"
  :license "https://github.com/mixradio/radix/blob/master/LICENSE"
  :url "https://github.com/mixradio/radix"

  :dependencies [[environ "1.0.1"]
                 [io.clj/logging "0.8.1"]
                 [metrics-clojure "2.3.0"]
                 [metrics-clojure-graphite "2.3.0"]
                 [metrics-clojure-jvm "2.3.0"]
                 [metrics-clojure-ring "2.3.0"]
                 [ns-tracker "0.3.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.slf4j/slf4j-api "1.7.12"]
                 [org.slf4j/jcl-over-slf4j "1.7.12"]
                 [org.slf4j/jul-to-slf4j "1.7.12"]
                 [org.slf4j/log4j-over-slf4j "1.7.12"]
                 [slingshot "0.12.2"]
                 [sonian/carica "1.2.1"]]

  :profiles {:dev {:resource-paths ["test/resources"]
                   :dependencies [[ch.qos.logback/logback-classic "1.1.3"]
                                  [midje "1.7.0"]]
                   :plugins [[lein-midje "3.1.3"]
                             [lein-marginalia "0.8.0"]]
              
                   :provided {:dependencies [[org.clojure/clojure "1.6.0"]]}}})
