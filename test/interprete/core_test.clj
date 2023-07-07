(ns interprete.core-test
  (:require [clojure.test :refer :all]
            [interprete.core :refer :all]))


(deftest operador?-test
  (testing "prueba de la funcion operador?"
    (is (= true (operador? (symbol "+"))))
    (is (= false (operador? (symbol "%"))))) 
  )