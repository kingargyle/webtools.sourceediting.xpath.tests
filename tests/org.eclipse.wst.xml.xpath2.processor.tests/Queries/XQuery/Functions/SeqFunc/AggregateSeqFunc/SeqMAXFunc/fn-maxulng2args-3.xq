(:*******************************************************:)
(:Test: maxulng2args-3                                    :)
(:Written By: Carmelo Montanez                            :)
(:Date: Fri Dec 10 10:15:48 GMT-05:00 2004                :)
(:Purpose: Evaluates The "max" function                  :)
(: with the arguments set as follows:                    :)
(:$arg1 = xs:unsignedLong(upper bound)                   :)
(:$arg2 = xs:unsignedLong(lower bound)                   :)
(:*******************************************************:)

fn:max((xs:unsignedLong("184467440737095516"),xs:unsignedLong("0")))