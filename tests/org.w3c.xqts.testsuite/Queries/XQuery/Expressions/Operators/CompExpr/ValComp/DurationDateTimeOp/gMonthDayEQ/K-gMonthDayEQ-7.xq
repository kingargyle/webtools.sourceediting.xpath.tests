(:*******************************************************:)
(: Test: K-gMonthDayEQ-7                                 :)
(: Written by: Frans Englich                             :)
(: Date: 2006-10-05T18:29:37+02:00                       :)
(: Purpose: Test that zone offset Z is equal to Z, in xs:gMonthDay. :)
(:*******************************************************:)
xs:gMonthDay("--03-01Z") eq xs:gMonthDay("--03-01Z")