package com.pampushko.translators.models.get_language_of_text;

import com.google.gson.annotations.SerializedName;
import com.pampushko.translators.models.BaseModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Slf4j
public class TextObj extends BaseModel
{
	@SerializedName("text")
	String text;
}
