(ns page-from-markdown.views.common
  (:require  [page-from-markdown.session :as session :refer [global-state]]))

(defn active? [state val]
  (if (= state val) "active" ""))

(defn header []
  [:div.page-header.row

  [:div#title.col-md-6 
   "page-from-markdown"]

   [:div.col-md-6
    [:ul.nav.nav-pills 
     [:li {:class (active? (global-state :nav) "home")}  [:a {:href "#/"} [:span [:i.fa.fa-home] " Home"]]]
     [:li {:class (active? (global-state :nav) "about")} [:a {:href "#/about"} "About"]]

     [:li {:class (active? (global-state :nav) "page-from-markdown")} [:a {:href "#/page-from-markdown"} "Markdown"]]]]

   ])
