CREATE TABLE recipient (
	id				BIGINT PRIMARY KEY,
	name			varchar(128) NOT NULL,
	email			varchar(256),
	subscription	boolean NOT NULL,
	created_at 		timestamp NOT NULL,
	updated_at 		timestamp
);

CREATE INDEX recipient_name_idx ON recipient(name);
CREATE UNIQUE INDEX recipient_email_idx ON recipient(email);

CREATE TABLE recipient_list (
	id 				integer PRIMARY KEY,
	name			varchar(128) NOT NULL	
);

CREATE INDEX recipient_list_name_idx ON recipient_list(name);
