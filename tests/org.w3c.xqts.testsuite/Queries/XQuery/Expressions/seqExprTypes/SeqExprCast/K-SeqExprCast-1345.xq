(:*******************************************************:)
(: Test: K-SeqExprCast-1345                              :)
(: Written by: Frans Englich                             :)
(: Date: 2006-10-05T18:29:39+02:00                       :)
(: Purpose: 'castable as' involving xs:hexBinary as source type and xs:time as target type should always evaluate to false. :)
(:*******************************************************:)
not(xs:hexBinary("0FB7") castable as xs:time)