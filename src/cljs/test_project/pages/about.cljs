; src/cljs/test-project/pages/about.cljs
(ns test-project.pages.about
  (:require [reagent.core :as reagent :refer [atom]]
            [test-project.store :refer [app-title]]))

(defn about-page []
  [:div [:h2 "About " @app-title]
   [:div [:a {:href "/"} "go to the home page"]]])
