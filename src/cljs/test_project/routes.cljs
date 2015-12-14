; src/cljs/test-project/routes.cljs
(ns test-project.routes
  (:require [reagent.session :as session]
            [secretary.core :as secretary :include-macros true]
            [test-project.pages.home :refer [home-page]]
            [test-project.pages.about :refer [about-page]]))

(secretary/defroute "/" []
  (session/put! :current-page #'home-page))

(secretary/defroute "/about" []
  (session/put! :current-page #'about-page))
