$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dealersearch.feature");
formatter.feature({
  "line": 2,
  "name": "Validating dealer search functionality",
  "description": "",
  "id": "validating-dealer-search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dealersearch"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "validate dealer search page",
  "description": "",
  "id": "validating-dealer-search-functionality;validate-dealer-search-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Iam on the home page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "menu"
      ],
      "line": 7
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 8
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on finddealer \"Find a Dealer\" link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select brand \"\u003cmake\u003e\" from Any make dropdown of dealer page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select model \"\u003cmodel\u003e\" from Any model dropdown of dealer page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select location \"\u003clocation\u003e\" from Any location dropdown of dealer page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on find dealers",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see the dealers",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the dealer page title should match the expected title \"\u003ctitle\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validating-dealer-search-functionality;validate-dealer-search-page;",
  "rows": [
    {
      "cells": [
        "make",
        "model",
        "location",
        "title"
      ],
      "line": 19,
      "id": "validating-dealer-search-functionality;validate-dealer-search-page;;1"
    },
    {
      "cells": [
        "AUDI",
        "Q7",
        "ACT - All",
        "AUDI Q7 Dealers ACT | carsguide"
      ],
      "line": 20,
      "id": "validating-dealer-search-functionality;validate-dealer-search-page;;2"
    },
    {
      "cells": [
        "BMW",
        "3 SERIES",
        "ACT - All",
        "BMW 3 SERIES Dealers ACT | carsguide"
      ],
      "line": 21,
      "id": "validating-dealer-search-functionality;validate-dealer-search-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6059411983,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "validate dealer search page",
  "description": "",
  "id": "validating-dealer-search-functionality;validate-dealer-search-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Dealersearch"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Iam on the home page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "menu"
      ],
      "line": 7
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 8
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on finddealer \"Find a Dealer\" link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select brand \"AUDI\" from Any make dropdown of dealer page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select model \"Q7\" from Any model dropdown of dealer page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select location \"ACT - All\" from Any location dropdown of dealer page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on find dealers",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see the dealers",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the dealer page title should match the expected title \"AUDI Q7 Dealers ACT | carsguide\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "SearchCarsStep.iam_on_the_home_page(String)"
});
formatter.result({
  "duration": 9905620006,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsStep.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 977553852,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Dealer",
      "offset": 23
    }
  ],
  "location": "Dealer_SearchStep.i_click_on_finddealer_link(String)"
});
formatter.result({
  "duration": 6368547999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUDI",
      "offset": 14
    }
  ],
  "location": "Dealer_SearchStep.select_brand_from_Any_make_dropdown_of_dealer_page(String)"
});
formatter.result({
  "duration": 679932276,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Q7",
      "offset": 14
    }
  ],
  "location": "Dealer_SearchStep.select_model_from_Any_model_dropdown_of_dealer_page(String)"
});
formatter.result({
  "duration": 877949122,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 17
    }
  ],
  "location": "Dealer_SearchStep.select_location_from_Any_location_dropdown_of_dealer_page(String)"
});
formatter.result({
  "duration": 423463863,
  "status": "passed"
});
formatter.match({
  "location": "Dealer_SearchStep.i_click_on_find_dealers()"
});
formatter.result({
  "duration": 8750697415,
  "status": "passed"
});
formatter.match({
  "location": "Dealer_SearchStep.i_should_see_the_dealers()"
});
formatter.result({
  "duration": 79427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUDI Q7 Dealers ACT | carsguide",
      "offset": 55
    }
  ],
  "location": "Dealer_SearchStep.the_dealer_page_title_should_match_the_expected_title(String)"
});
formatter.result({
  "duration": 246390948,
  "status": "passed"
});
formatter.after({
  "duration": 961229639,
  "status": "passed"
});
formatter.before({
  "duration": 3733784795,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "validate dealer search page",
  "description": "",
  "id": "validating-dealer-search-functionality;validate-dealer-search-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Dealersearch"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Iam on the home page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "menu"
      ],
      "line": 7
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 8
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on finddealer \"Find a Dealer\" link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select brand \"BMW\" from Any make dropdown of dealer page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select model \"3 SERIES\" from Any model dropdown of dealer page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select location \"ACT - All\" from Any location dropdown of dealer page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on find dealers",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see the dealers",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the dealer page title should match the expected title \"BMW 3 SERIES Dealers ACT | carsguide\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "SearchCarsStep.iam_on_the_home_page(String)"
});
formatter.result({
  "duration": 10147729207,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsStep.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 1046090990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Dealer",
      "offset": 23
    }
  ],
  "location": "Dealer_SearchStep.i_click_on_finddealer_link(String)"
});
formatter.result({
  "duration": 4974109732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 14
    }
  ],
  "location": "Dealer_SearchStep.select_brand_from_Any_make_dropdown_of_dealer_page(String)"
});
formatter.result({
  "duration": 728465233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 SERIES",
      "offset": 14
    }
  ],
  "location": "Dealer_SearchStep.select_model_from_Any_model_dropdown_of_dealer_page(String)"
});
formatter.result({
  "duration": 1156042265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 17
    }
  ],
  "location": "Dealer_SearchStep.select_location_from_Any_location_dropdown_of_dealer_page(String)"
});
formatter.result({
  "duration": 493321674,
  "status": "passed"
});
formatter.match({
  "location": "Dealer_SearchStep.i_click_on_find_dealers()"
});
formatter.result({
  "duration": 3647012341,
  "status": "passed"
});
formatter.match({
  "location": "Dealer_SearchStep.i_should_see_the_dealers()"
});
formatter.result({
  "duration": 75780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW 3 SERIES Dealers ACT | carsguide",
      "offset": 55
    }
  ],
  "location": "Dealer_SearchStep.the_dealer_page_title_should_match_the_expected_title(String)"
});
formatter.result({
  "duration": 174668231,
  "status": "passed"
});
formatter.after({
  "duration": 822139706,
  "status": "passed"
});
});