(ns page-from-markdown.core
  (:require [reagent.core :as reagent]
            [page-from-markdown.session :as session :refer [global-state]]
            [page-from-markdown.routes :as routes]
            [page-from-markdown.views.common :as common]))

(defn page-render []
  [:div.container
   [common/header]
   [(global-state :current-page)]])

(defn page-component [] 
  (reagent/create-class {:component-will-mount routes/app-routes
                         :render page-render}))

;; initialize app
(reagent/render-component [page-component]
                          (.getElementById js/document "app"))
