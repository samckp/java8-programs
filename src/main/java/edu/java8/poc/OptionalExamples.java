package edu.java8.poc;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        Optional<Integer> int1 = Optional.empty();

        Optional<Integer> int2 = Optional.of(5);

        Optional<Integer> int3 = Optional.ofNullable(null);
//or
        Optional<Integer> int4 = Optional.ofNullable(5);

        Optional<Integer> possible = Optional.of(5);
        possible.ifPresent(System.out::println);

        //Assume this value has returned from a method
        Optional<Company> companyOptional = Optional.empty();

//Now check optional; if value is present then return it,
//else create a new Company object and return it
        Company company = companyOptional.orElse(new Company());

//OR you can throw an exception as well
        Company company1 = companyOptional.orElseThrow(IllegalStateException::new);

    }

    static class Company{
        private int companyId;

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }
    }
}
