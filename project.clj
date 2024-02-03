(defproject clj-portuguese-spellchecker "0.1.0-SNAPSHOT"
  :description "Portuguese Spellchecker in Clojure"
  :url "https://github.com/karollynecosta/clj-portuguese-spellchecker"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.apache.commons/commons-lang3 "3.12.0"]]
  :main ^:skip-aot clj-portuguese-spellchecker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
