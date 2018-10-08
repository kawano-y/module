package com.module.person;

import com.module.common.Code;

import lombok.Getter;

public enum Todofuken implements Code<Integer>{
	 HOKKAIDO       (1, "北海道", ""),
	    AOMORI      (2, "青森", "県"),
	    IWATE       (3, "岩手", "県"),
	    MIYAGI      (4, "宮城", "県"),
	    AKITA       (5, "秋田", "県"),
	    YAMAGATA    (6, "山形", "県"),
	    FUKUSHIMA   (7, "福島", "県"),
	    IBARAKI     (8, "茨城", "県"),
	    TOCHIGI     (9, "栃木", "県"),
	    GUNMA       (10, "群馬", "県"),
	    SAITAMA     (11, "埼玉", "県"),
	    CHIBA       (12, "千葉", "県"),
	    TOKYO       (13, "東京", "都"),
	    KANAGAWA    (14, "神奈川", "県"),
	    NIIGATA     (15, "新潟", "県"),
	    TOYAMA      (16, "富山", "県"),
	    ISHIKAWA    (17, "石川", "県"),
	    FUKUI       (18, "福井", "県"),
	    YAMANASHI   (19, "山梨", "県"),
	    NAGANO      (20, "長野", "県"),
	    GIFU        (21, "岐阜", "県"),
	    SHIZUOKA    (22, "静岡", "県"),
	    AICHI       (23, "愛知", "県"),
	    MIE         (24, "三重", "県"),
	    SHIGA       (25, "滋賀", "県"),
	    KYOTO       (26, "京都", "府"),
	    OSAKA       (27, "大阪", "県"),
	    HYOGO       (28, "兵庫", "県"),
	    NARA        (29, "奈良", "県"),
	    WAKAYAMA    (30, "和歌山", "県"),
	    TOTTORI     (31, "鳥取", "県"),
	    SHIMANE     (32, "島根", "県"),
	    OKAYAMA     (33, "岡山", "県"),
	    HIROSHIMA   (34, "広島", "県"),
	    YAMAGUCHI   (35, "山口", "県"),
	    TOKUSHIMA   (36, "徳島", "県"),
	    KAGAWA      (37, "香川", "県"),
	    EHIME       (38, "愛媛", "県"),
	    KOCHI       (39, "高知", "県"),
	    FUKUOKA     (40, "福岡", "県"),
	    SAGA        (41, "佐賀", "県"),
	    NAGASAKI    (42, "長崎", "県"),
	    KUMAMOTO    (43, "熊本", "県"),
	    OITA        (44, "大分", "県"),
	    MIYAZAKI    (45, "宮崎", "県"),
	    KAGOSHIMA   (46, "鹿児島", "県"),
	    OKINAWA     (47, "沖縄", "県");

	private Integer code;

	@Getter
	private String text;
	
	private String suffix;

	private Todofuken(Integer code, String text, String suffix) {
		this.code = code;
		this.text = text;
		this.suffix = suffix;
	}
	
	public String fullText(){
		return this.text + this.suffix;
	}

	@Override
	public Integer getCode(){
		return this.code;
	}
	
	/**
	 * 都道府県名が同じであるか
	 * 県がついているときとついていないときの両方を考慮する
	 * @param todofukenMei
	 * @return
	 */
	public boolean equalsMei(String todofukenMei) {
		if (this.text.equals(todofukenMei)) {
			return true;
		}
		return this.fullText().equals(todofukenMei);
	}
}
