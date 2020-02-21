;; An approach for solve Random Seat assignment puzzle 
;; from https://practicalli.github.io/clojure/puzzles/random-seat-assignment.html

(defn assignSeats
  [seats]
  (loop [seats seats new-seats []]
    (if (= (count new-seats) seats)
      new-seats
      (let [okRandom (inc (rand-int seats))]
        (if (.contains new-seats okRandom)
          (recur seats new-seats)
          (recur seats (conj new-seats okRandom)))))))
