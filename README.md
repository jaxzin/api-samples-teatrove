# ESPN API Sample (TeaTrove)

## Running on Heroku

Assumes your local environment is already [setup to deploy to Heroku](http://devcenter.heroku.com/articles/quickstart).

    $ git clone http://github.com/jaxzin/api-samples-teatrove.git
    $ cd api-samples-teatrove
    $ heroku create --stack cedar
    $ git push heroku master
    ... wait for it to push and launch ...
    $ heroku config:add TEA_ADMIN_PASSWORD=[a secret to protect your admin console]
    $ heroku config:add espn_api_key=[your app key from developer.espn.com]
    ... wait for it to add the config vars and restart ...
    $ heroku open

## Light Reading

* [The ESPN Developer Center](http://developer.espn.com)
* [TeaTrove](http://teatrove.org)
