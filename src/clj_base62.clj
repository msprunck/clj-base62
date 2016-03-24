(ns clj-base62)

(def base62-chars "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz")

(defn base62
  "Generates a base62 unique identifier. n is the string length of the generated id.
  See http://stackoverflow.com/a/9543797"
  [n]
  (apply str (repeatedly n #(rand-nth base62-chars))))
