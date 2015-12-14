; src/cljs/test-project/actions.cljs
(ns test-project.actions)

(def dispatcher (atom {}))
(def actions (atom {}))

(defn emit [action data]
  (swap! dispatcher #(merge {:action action} data)))

(defn register [action callback]
  (swap! actions conj {action callback}))

(add-watch dispatcher :watcher
  (fn [key atom old-state new-state]
    (if-let [action (get @actions (:action new-state))]
      (action new-state))))
