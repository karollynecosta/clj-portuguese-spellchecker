(ns clj-portuguese-spellchecker.core
  (:require [clojure.string :as str]
            [clojure.java.io :as io])
  (:import (org.apache.commons.lang3 StringUtils)))

(def dictionary
  (set (map str/trim (str/split-lines (slurp (io/resource "br-utf8.txt"))))))

(defn check?
  "Check if a word is in the dictionary"
  [word]
  (contains? dictionary word))

(defn distance
  "Check two words and return the Levenshtein distance between them"
  [word1 word2]
  (StringUtils/getLevenshteinDistance word1 word2))

(defn min-distance
  "Takes a word and return min-key of a partial distance function"
  [word]
  (apply min-key (partial distance word) dictionary))


(defn -main
  [& args]
  (let [word (first args)]
    (if (check? word)
      (println "Correto")
      (println "Voce quis dizer" (min-distance word) "?"))))
