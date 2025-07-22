-- h2-initdata.sql

-- H2 데이터베이스 SQL 문법에 맞춰 작성합니다.

INSERT INTO post (post_id, title, contents, author, created_date_time) VALUES
('c1fa6799-6193-4ef0-81ff-e1badbf662a1', '첫 번째 게시물', '첫 번째 게시물 내용입니다.', '작성자1', NOW()),
('f47ac10b-58cc-4372-a567-0e02b2c3d489', '두 번째 게시물 제목', '내용은 여기에', '작성자2', NOW()),
('b2a9d8e0-5a67-4d1e-9eb2-38d7b1a12355', '세 번째 글', '세 번째 글의 본문입니다.', '작성자3', NOW());