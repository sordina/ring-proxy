(defproject tailrecursion/ring-proxy "1.0.0.1"

  :version-spec "1.0.~{:env/BUILD_NUMBER}"

  :description "Proxy ring routes"

  :documentation "README.md"
  
  :url "https://github.com/tailrecursion/ring-proxy"

  :license "Auspost MPDM Closed Source"

  :plugins [[lein-ring "0.8.10"]
            [lein-version-spec "0.0.4"]]

  :target-path "target/%s"

  :dependencies [ [org.clojure/clojure     "1.6.0"  :scope "provided"]
                  [adzerk/bootlaces        "0.1.10" :scope "test"    ]
                  [ring/ring-core          "1.4.0-RC1"               ]
                  [ring/ring-jetty-adapter "1.4.0-RC1"               ]
                  [clj-http                "1.1.2"                   ] ]

  :repositories [["central" {:url "http://nexus1.npe.apdm.local/nexus/content/repositories/central/"}]
                 ["clojars" {:url "http://nexus1.npe.apdm.local/nexus/content/repositories/clojars/"}]
                 ["new-core" {:url "http://nexus1.npe.apdm.local/nexus/content/repositories/new-core/" :username "admin" :password "admin123" :sign-releases false}]])
