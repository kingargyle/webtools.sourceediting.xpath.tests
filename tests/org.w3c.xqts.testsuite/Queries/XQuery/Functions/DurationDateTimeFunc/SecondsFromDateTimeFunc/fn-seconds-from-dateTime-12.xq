(:*******************************************************:)
(:Test: seconds-from-dateTime-12                         :)
(:Written By: Carmelo Montanez                           :)
(:Date: June 6, 2005                                     :)
(:Purpose: Evaluates The "seconds-from-dateTime" function:)
(:as part of a "idiv" expression.                        :) 
(:*******************************************************:)

fn:seconds-from-dateTime(xs:dateTime("1970-01-01T10:10:10Z")) idiv fn:seconds-from-dateTime(xs:dateTime("1970-01-01T02:05:05Z"))