CREATE TABLE PLAYLIST
(
MUSIC_CODE NUMBER NOT NULL,
MUSIC_NAME VARCHAR2(50) NOT NULL,
CATEGORY_CODE NUMBER NOT NULL,
DOWNLOADABLE_STATUS CHAR(1) NOT NULL,
ARTIST VARCHAR2(40)
);

COMMENT ON COLUMN PLAYLIST.MUSIC_CODE IS '음악코드';
COMMENT ON COLUMN PLAYLIST.MUSIC_NAME IS '음악명';
COMMENT ON COLUMN PLAYLIST.CATEGORY_CODE IS '카테고리코드';
COMMENT ON COLUMN PLAYLIST.DOWNLOADABLE_STATUS IS '다운가능상태';
COMMENT ON COLUMN PLAYLIST.ARTIST IS '가수명';
COMMENT ON TABLE PLAYLIST IS '플레이리스트';

CREATE TABLE PLAY_CATEGORY
(
CATEGORY_CODE NUMBER NOT NULL,
CATEGORY_NAME VARCHAR2(40) NOT NULL,
REF_CATEGORY_CODE NUMBER
);

COMMENT ON COLUMN PLAY_CATEGORY.CATEGORY_CODE IS '카테고리코드';
COMMENT ON COLUMN PLAY_CATEGORY.CATEGORY_NAME IS '카테고리명';
COMMENT ON COLUMN PLAY_CATEGORY.REF_CATEGORY_CODE IS '상위카테고리코드';
COMMENT ON TABLE PLAY_CATEGORY IS '카테고리';

CREATE SEQUENCE SEQ_PLAY_CATEGORY;
CREATE SEQUENCE SEQ_PLAYLIST;


INSERT INTO PLAY_CATEGORY VALUES (SEQ_PLAY_CATEGORY.NEXTVAL, '케이팝', 1);
INSERT INTO PLAY_CATEGORY VALUES (SEQ_PLAY_CATEGORY.NEXTVAL, '인디', NULL);
INSERT INTO PLAY_CATEGORY VALUES (SEQ_PLAY_CATEGORY.NEXTVAL, '발라드', 2);
INSERT INTO PLAY_CATEGORY VALUES (SEQ_PLAY_CATEGORY.NEXTVAL, '트로트', 3);

INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, 'Hype Boy', 1 , 'Y','뉴진스');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, 'Love Dive', 1 , 'Y','아이브');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, 'Antifragile', 1,'Y','르세라핌');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, 'Everything', 4 ,'Y','검정치마');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, '좋은밤 좋은꿈', 4 ,'Y','너드커넥션');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, '눈사람', 2 , 'Y','정승환');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, '너의 모든 순간', 2 ,'Y','성시경');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, '바램', 3 ,'Y','임영웅');
INSERT INTO PLAYLIST VALUES (SEQ_PLAYLIST.NEXTVAL, '막걸리 한잔', 3 ,'Y','영탁');


