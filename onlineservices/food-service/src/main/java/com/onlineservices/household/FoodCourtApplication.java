package com.onlineservices.household;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FoodCourtApplication extends Application<FoodCourtConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FoodCourtApplication().run(args);
    }

    @Override
    public String getName() {
        return "Food Court";
    }

    @Override
    public void initialize(final Bootstrap<FoodCourtConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final FoodCourtConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
