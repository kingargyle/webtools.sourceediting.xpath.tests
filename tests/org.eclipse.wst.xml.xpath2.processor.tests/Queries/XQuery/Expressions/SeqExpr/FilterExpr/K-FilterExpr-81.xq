(:*******************************************************:)
(: Test: K-FilterExpr-81                                 :)
(: Written by: Frans Englich                             :)
(: Date: 2006-10-05T18:29:36+02:00                       :)
(: Purpose: Predicates involving the focus' context item. :)
(:*******************************************************:)
deep-equal((0, 1, 2), (0, 1, 2)[. eq 0 or . eq 1 or . eq 2])