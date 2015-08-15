(ns rot13.core
  (:gen-class))

(defn encrypt-char
  "Applies ROT13 encryption to an input char"
  [c]
  (let [c-int (int c)
        a (int \a) A (int \A)
        m (int \m) M (int \M)
        n (int \n) N (int \N)
        z (int \z) Z (int \Z)]
    (cond
      (and (>= c-int a) (<= c-int m)) (char (+ c-int 13))
      (and (>= c-int A) (<= c-int M)) (char (+ c-int 13))
      (and (>= c-int n) (<= c-int z)) (char (- c-int 13))
      (and (>= c-int N) (<= c-int Z)) (char (- c-int 13))
      :else c)
    )
  )

(defn decrypt-char
  "Applies ROT13 decryption to an input char"
  [c]
  (encrypt-char c))

(defn encrypt
  "Applies ROT13 encryption to an input string"
  [sentence]
  (let [list (map encrypt-char (seq sentence))]
    (apply str list)))

(defn decrypt
  "Applies ROT13 decryption to an input string"
  [sentence]
  (encrypt sentence))

(defn -main [& [args]]
  (if args (println (encrypt (str args)))))