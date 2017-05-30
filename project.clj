(defproject apache-commons-matrix "0.3.1"
  :description "Implementation of core.matrix backed by Apache Commons Math matrices"
  :url "https://github.com/Adereth/apache-commons-matrix"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.60.3"]
                 [org.apache.commons/commons-math3 "3.6.1"]]
  :source-paths ["test" "src"])
