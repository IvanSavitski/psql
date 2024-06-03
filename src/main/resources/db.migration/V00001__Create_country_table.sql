CREATE DATABASE IF NOT EXISTS psql;

-- Создание таблицы
CREATE TABLE countries (
    id SERIAL PRIMARY KEY,
    country_name VARCHAR(255) NOT NULL,
    country_languages TEXT,
    country_population BIGINT NOT NULL,
    capital_population BIGINT NOT NULL,
    non_capital_population BIGINT NOT NULL
);


-- Страны с одним языком
INSERT INTO countries (country_name, country_languages, country_population, capital_population, non_capital_population)
VALUES
    ('Russia', 'Russian', 144100000, 12655050, 131444950),
    ('France', 'French', 67059887, 2206488, 64853399),
    ('Germany', 'German', 83123456, 3670000, 79453456),
    ('Italy', 'Italian', 60359546, 2873494, 57486052),
    ('Spain', 'Spanish', 46934632, 3223334, 43711298),
    ('United Kingdom', 'English', 66436569, 8982000, 57454569),
    ('Poland', 'Polish', 37846611, 1765069, 36081542),
    ('Romania', 'Romanian', 19237691, 1883425, 17354266),
    ('Netherlands', 'Dutch', 17231017, 872680, 16358337),
    ('Belgium', 'Dutch, French, German', 11589623, 1219970, 10369653);



-- Страны с двумя языками
INSERT INTO countries (country_name, country_languages, country_population, capital_population, non_capital_population)
VALUES
    ('Canada', 'English, French', 37058856, 935000, 36123856),
    ('Switzerland', 'German, French, Italian', 8654622, 418132, 8236490),
    ('Finland', 'Finnish, Swedish', 5540720, 643272, 4897448),
    ('Ireland', 'English, Irish', 4937786, 554554, 4383232),
    ('Norway', 'Norwegian, Sami', 5421241, 694694, 4726547),
    ('Austria', 'German, Burgenland Croatian, Hungarian, Slovene', 8917508, 1888776, 7028732),
    ('Denmark', 'Danish, Faroese, Greenlandic', 5806081, 602481, 5203600),
    ('Sweden', 'Swedish, Finnish', 10099265, 935619, 9163646),
    ('Portugal', 'Portuguese', 10196709, 505526, 9691183),
    ('Greece', 'Greek', 10716322, 664046, 10052276);



-- Страны с тремя и более языками
INSERT INTO countries (country_name, country_languages, country_population, capital_population, non_capital_population)
VALUES
    ('India', 'Hindi, Bengali, Telugu, Marathi, Tamil, Urdu, Gujarati, Kannada, Malayalam, Odia, Punjabi, Assamese, Maithili, Others', 1380004385, 29399141, 1350605244),
    ('South Africa', 'Afrikaans, English, isiNdebele, isiXhosa, isiZulu, Sesotho, Sepedi, Setswana, siSwati, Tshivenda, Xitsonga', 58558270, 4488000, 54070270),
    ('Belgium', 'Dutch, French, German', 11589623, 1219970, 10369653),
    ('Singapore', 'English, Malay, Mandarin Chinese, Tamil', 5703569, 5535000, 168569),
    ('Switzerland', 'German, French, Italian, Romansh', 8654622, 418132, 8236490),
    ('Israel', 'Hebrew, Arabic', 9053300, 874140, 8179160),
    ('Luxembourg', 'French, German, Luxembourgish', 626108, 178800, 447308),
    ('Kazakhstan', 'Kazakh, Russian, Uzbek, Uighur, Ukrainian, Tatar, German', 18756499, 1030000, 17726499),
    ('Philippines', 'Tagalog, Cebuano, Ilocano, Bikol, Kapampangan, Pangasinan, Visayan languages, English', 109581078, 1780000, 107801078),
    ('Cameroon', 'French, English, Fulfulde, Ewondo, Bassa, Duala', 26545863, 2750000, 23795863);


-- Страны, где не используется английский
INSERT INTO countries (country_name, country_languages, country_population, capital_population, non_capital_population)
VALUES
    ('Japan', 'Japanese', 126476461, 37435000, 89041461),
    ('China', 'Mandarin Chinese, Cantonese, Minbei, Minnan, Xiang, Gan, Hakka, Uyghur, Kyrgyz, Mongolian', 1439323776, 2154000, 1418169776),
    ('Brazil', 'Portuguese', 211049527, 6320446, 204729081),
    ('Mexico', 'Spanish', 128932753, 9209944, 119722809),
    ('Vietnam', 'Vietnamese', 97338579, 8053663, 89284916),
    ('Iran', 'Persian, Azeri, Kurdish, Gilaki, Mazandarani, Luri, Balochi, Arabic', 83992949, 8700000, 75292949),
    ('Thailand', 'Thai, Lao', 69799978, 8249117, 61550861),
    ('Turkey', 'Turkish', 84339067, 15466000, 68873067),
    ('Egypt', 'Arabic', 102334403, 9672000, 92662403),
    ('Morocco', 'Arabic, Berber (Tamazight)', 36910560, 1935800, 34974760);

