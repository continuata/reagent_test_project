; src/cljs/test-project/store.cljs
(ns test-project.store
  (:require [reagent.core :as reagent :refer [atom]]
            [test-project.actions :as actions]))

(def app-title (atom "Test Project"))

(defn update-title [data]
  (reset! app-title (:value data)))

(actions/register :update-title update-title)
