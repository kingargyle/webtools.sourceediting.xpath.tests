(:*******************************************************:)
(: Test: K-DayTimeDurationMultiply-9                     :)
(: Written by: Frans Englich                             :)
(: Date: 2006-10-05T18:29:36+02:00                       :)
(: Purpose: Simple test of multiplying a xs:dayTimeDuration with NaN. :)
(:*******************************************************:)
xs:dayTimeDuration("P3DT4H3M3.100S") * xs:double("NaN")