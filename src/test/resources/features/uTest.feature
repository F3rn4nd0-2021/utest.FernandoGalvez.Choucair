#Autor:Fermnando Galvez
  @stories
  Feature: uTest
     I want to sing up to uTest
  @scenario1

  Scenario Outline: Sing up to www.utest.com
    Given that fernando wants to sign up to uTest
    When he clicks hhe Join Today button
    And he introduces his personal data

      | strFirstName   | strLastName   | strEmailAddress   | strBirthMonth   | strBirthDay   | strBirthYear   | strUserLanguage   | strCity   | strZipPostalCode   | strCountry   | strComputerOs   | strOsVersion   | strComputerLanguage   | strMobileDevice   | strModel   | strMobileOs   | strPassword   |
      | <strFirstName> | <strLastName> | <strEmailAddress> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strUserLanguage> | <strCity> | <strZipPostalCode> | <strCountry> | <strComputerOs> | <strOsVersion> | <strComputerLanguage> | <strMobileDevice> | <strModel> | <strMobileOs> | <strPassword> |

    Then the register is complete
      | strSuccessSignUpMessage                                                 |
      | Welcome to the world's largest community of freelance software testers! |
    Examples:
      | strFirstName     | strLastName     | strEmailAddress         | strBirthMonth | strBirthDay | strBirthYear | strUserLanguage | strCity        |  strZipPostalCode | strCountry | strComputerOs | strOsVersion | strComputerLanguage | strMobileDevice | strModel   | strMobileOs | strPassword   |
      | fernando anonio  | Galez moreno    | juanchosala2018@gmail.com| May           |  7          | 1998         | Spanish         | Bogota         |  500001           | Colombia   | Windows       | 10           | Spanish             | Xiaomi          | Mi 9       | Android 11  | F3rn4nd0_1998 |
