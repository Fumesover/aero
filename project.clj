;; Copyright © 2015, JUXT LTD.

(defproject aero "1.1.5"
  :description "A small library for explicit, intentful configuration."
  :url "http://github.com/juxt/aero"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :plugins [[lein-shell "0.5.0"]
            [lein-cloverage "1.0.13"]]

  :aliases {"test-all" ["do" ["test"] ["shell" "./lumo-test"]]}
  :eastwood {:namespaces [aero.core aero.alpha.core]}
  :profiles
  {:provided {:dependencies [[org.clojure/clojure "1.8.0"]]}
   :dev {:plugins [[lein-cljfmt "0.5.7"]
                   [jonase/eastwood "0.3.4"]]}})
