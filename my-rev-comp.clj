;; This is my implemententation of comp, but reverse, first functions will apply first!

(defn my-comp
  [& allFn]
  (fn [& args]
    (reduce 
     (fn [accFn currentFn] (apply currentFn accFn))
     (apply (first allFn) args)
     (rest allFn))))
