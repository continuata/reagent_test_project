; src/cljs/test-project/pages/home.cljs
(ns test-project.pages.home
  (:require [reagent.core :as reagent :refer [atom]]
            [test-project.store :refer [app-title]]
            [test-project.actions :as actions]))

(defn update-text [evt]
  (actions/emit :update-title {:value (-> evt .-target .-value)}))

(defn home-page []
  [:div [:h2 "Welcome to " @app-title]
    [:div [:a {:href "/about"} "go to about page"]]
    [:div "change title:"
      [:input {:value @app-title :on-change update-text}]]])
