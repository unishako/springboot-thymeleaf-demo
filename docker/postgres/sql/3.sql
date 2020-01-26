\c demo
INSERT INTO users (password, name, create_date, update_date, version)
    SELECT
        i, format('高坂穂乃果%s', i), now(), now(), 1
    FROM
        generate_series(1, 1000) as i
;
