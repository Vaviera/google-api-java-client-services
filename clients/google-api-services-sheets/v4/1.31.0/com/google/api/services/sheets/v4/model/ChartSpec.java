/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sheets.v4.model;

/**
 * The specifications of a chart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * The alternative text that describes the chart. This is often used for accessibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String altText;

  /**
   * The background color of the entire chart. Not applicable to Org charts. Deprecated: Use
   * background_color_style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color backgroundColor;

  /**
   * The background color of the entire chart. Not applicable to Org charts. If background_color is
   * also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle backgroundColorStyle;

  /**
   * A basic chart specification, can be one of many kinds of charts. See BasicChartType for the
   * list of all charts this supports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicChartSpec basicChart;

  /**
   * A bubble chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BubbleChartSpec bubbleChart;

  /**
   * A candlestick chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CandlestickChartSpec candlestickChart;

  /**
   * If present, the field contains data source chart specific properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceChartProperties dataSourceChartProperties;

  /**
   * The filters applied to the source data of the chart. Only supported for data source charts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FilterSpec> filterSpecs;

  /**
   * The name of the font to use by default for all chart text (e.g. title, axis labels, legend). If
   * a font is specified for a specific part of the chart it will override this font name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fontName;

  /**
   * Determines how the charts will use hidden rows or columns.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hiddenDimensionStrategy;

  /**
   * A histogram chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HistogramChartSpec histogramChart;

  /**
   * True to make a chart fill the entire space in which it's rendered with minimum padding. False
   * to use the default padding. (Not applicable to Geo and Org charts.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean maximized;

  /**
   * An org chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrgChartSpec orgChart;

  /**
   * A pie chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PieChartSpec pieChart;

  /**
   * A scorecard chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScorecardChartSpec scorecardChart;

  /**
   * The order to sort the chart data by. Only a single sort spec is supported. Only supported for
   * data source charts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SortSpec> sortSpecs;

  /**
   * The subtitle of the chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * The subtitle text format. Strikethrough, underline, and link are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat subtitleTextFormat;

  /**
   * The subtitle text position. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextPosition subtitleTextPosition;

  /**
   * The title of the chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The title text format. Strikethrough, underline, and link are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat titleTextFormat;

  /**
   * The title text position. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextPosition titleTextPosition;

  /**
   * A treemap chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TreemapChartSpec treemapChart;

  /**
   * A waterfall chart specification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WaterfallChartSpec waterfallChart;

  /**
   * The alternative text that describes the chart. This is often used for accessibility.
   * @return value or {@code null} for none
   */
  public java.lang.String getAltText() {
    return altText;
  }

  /**
   * The alternative text that describes the chart. This is often used for accessibility.
   * @param altText altText or {@code null} for none
   */
  public ChartSpec setAltText(java.lang.String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * The background color of the entire chart. Not applicable to Org charts. Deprecated: Use
   * background_color_style.
   * @return value or {@code null} for none
   */
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * The background color of the entire chart. Not applicable to Org charts. Deprecated: Use
   * background_color_style.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public ChartSpec setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The background color of the entire chart. Not applicable to Org charts. If background_color is
   * also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getBackgroundColorStyle() {
    return backgroundColorStyle;
  }

  /**
   * The background color of the entire chart. Not applicable to Org charts. If background_color is
   * also set, this field takes precedence.
   * @param backgroundColorStyle backgroundColorStyle or {@code null} for none
   */
  public ChartSpec setBackgroundColorStyle(ColorStyle backgroundColorStyle) {
    this.backgroundColorStyle = backgroundColorStyle;
    return this;
  }

  /**
   * A basic chart specification, can be one of many kinds of charts. See BasicChartType for the
   * list of all charts this supports.
   * @return value or {@code null} for none
   */
  public BasicChartSpec getBasicChart() {
    return basicChart;
  }

  /**
   * A basic chart specification, can be one of many kinds of charts. See BasicChartType for the
   * list of all charts this supports.
   * @param basicChart basicChart or {@code null} for none
   */
  public ChartSpec setBasicChart(BasicChartSpec basicChart) {
    this.basicChart = basicChart;
    return this;
  }

  /**
   * A bubble chart specification.
   * @return value or {@code null} for none
   */
  public BubbleChartSpec getBubbleChart() {
    return bubbleChart;
  }

  /**
   * A bubble chart specification.
   * @param bubbleChart bubbleChart or {@code null} for none
   */
  public ChartSpec setBubbleChart(BubbleChartSpec bubbleChart) {
    this.bubbleChart = bubbleChart;
    return this;
  }

  /**
   * A candlestick chart specification.
   * @return value or {@code null} for none
   */
  public CandlestickChartSpec getCandlestickChart() {
    return candlestickChart;
  }

  /**
   * A candlestick chart specification.
   * @param candlestickChart candlestickChart or {@code null} for none
   */
  public ChartSpec setCandlestickChart(CandlestickChartSpec candlestickChart) {
    this.candlestickChart = candlestickChart;
    return this;
  }

  /**
   * If present, the field contains data source chart specific properties.
   * @return value or {@code null} for none
   */
  public DataSourceChartProperties getDataSourceChartProperties() {
    return dataSourceChartProperties;
  }

  /**
   * If present, the field contains data source chart specific properties.
   * @param dataSourceChartProperties dataSourceChartProperties or {@code null} for none
   */
  public ChartSpec setDataSourceChartProperties(DataSourceChartProperties dataSourceChartProperties) {
    this.dataSourceChartProperties = dataSourceChartProperties;
    return this;
  }

  /**
   * The filters applied to the source data of the chart. Only supported for data source charts.
   * @return value or {@code null} for none
   */
  public java.util.List<FilterSpec> getFilterSpecs() {
    return filterSpecs;
  }

  /**
   * The filters applied to the source data of the chart. Only supported for data source charts.
   * @param filterSpecs filterSpecs or {@code null} for none
   */
  public ChartSpec setFilterSpecs(java.util.List<FilterSpec> filterSpecs) {
    this.filterSpecs = filterSpecs;
    return this;
  }

  /**
   * The name of the font to use by default for all chart text (e.g. title, axis labels, legend). If
   * a font is specified for a specific part of the chart it will override this font name.
   * @return value or {@code null} for none
   */
  public java.lang.String getFontName() {
    return fontName;
  }

  /**
   * The name of the font to use by default for all chart text (e.g. title, axis labels, legend). If
   * a font is specified for a specific part of the chart it will override this font name.
   * @param fontName fontName or {@code null} for none
   */
  public ChartSpec setFontName(java.lang.String fontName) {
    this.fontName = fontName;
    return this;
  }

  /**
   * Determines how the charts will use hidden rows or columns.
   * @return value or {@code null} for none
   */
  public java.lang.String getHiddenDimensionStrategy() {
    return hiddenDimensionStrategy;
  }

  /**
   * Determines how the charts will use hidden rows or columns.
   * @param hiddenDimensionStrategy hiddenDimensionStrategy or {@code null} for none
   */
  public ChartSpec setHiddenDimensionStrategy(java.lang.String hiddenDimensionStrategy) {
    this.hiddenDimensionStrategy = hiddenDimensionStrategy;
    return this;
  }

  /**
   * A histogram chart specification.
   * @return value or {@code null} for none
   */
  public HistogramChartSpec getHistogramChart() {
    return histogramChart;
  }

  /**
   * A histogram chart specification.
   * @param histogramChart histogramChart or {@code null} for none
   */
  public ChartSpec setHistogramChart(HistogramChartSpec histogramChart) {
    this.histogramChart = histogramChart;
    return this;
  }

  /**
   * True to make a chart fill the entire space in which it's rendered with minimum padding. False
   * to use the default padding. (Not applicable to Geo and Org charts.)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMaximized() {
    return maximized;
  }

  /**
   * True to make a chart fill the entire space in which it's rendered with minimum padding. False
   * to use the default padding. (Not applicable to Geo and Org charts.)
   * @param maximized maximized or {@code null} for none
   */
  public ChartSpec setMaximized(java.lang.Boolean maximized) {
    this.maximized = maximized;
    return this;
  }

  /**
   * An org chart specification.
   * @return value or {@code null} for none
   */
  public OrgChartSpec getOrgChart() {
    return orgChart;
  }

  /**
   * An org chart specification.
   * @param orgChart orgChart or {@code null} for none
   */
  public ChartSpec setOrgChart(OrgChartSpec orgChart) {
    this.orgChart = orgChart;
    return this;
  }

  /**
   * A pie chart specification.
   * @return value or {@code null} for none
   */
  public PieChartSpec getPieChart() {
    return pieChart;
  }

  /**
   * A pie chart specification.
   * @param pieChart pieChart or {@code null} for none
   */
  public ChartSpec setPieChart(PieChartSpec pieChart) {
    this.pieChart = pieChart;
    return this;
  }

  /**
   * A scorecard chart specification.
   * @return value or {@code null} for none
   */
  public ScorecardChartSpec getScorecardChart() {
    return scorecardChart;
  }

  /**
   * A scorecard chart specification.
   * @param scorecardChart scorecardChart or {@code null} for none
   */
  public ChartSpec setScorecardChart(ScorecardChartSpec scorecardChart) {
    this.scorecardChart = scorecardChart;
    return this;
  }

  /**
   * The order to sort the chart data by. Only a single sort spec is supported. Only supported for
   * data source charts.
   * @return value or {@code null} for none
   */
  public java.util.List<SortSpec> getSortSpecs() {
    return sortSpecs;
  }

  /**
   * The order to sort the chart data by. Only a single sort spec is supported. Only supported for
   * data source charts.
   * @param sortSpecs sortSpecs or {@code null} for none
   */
  public ChartSpec setSortSpecs(java.util.List<SortSpec> sortSpecs) {
    this.sortSpecs = sortSpecs;
    return this;
  }

  /**
   * The subtitle of the chart.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * The subtitle of the chart.
   * @param subtitle subtitle or {@code null} for none
   */
  public ChartSpec setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * The subtitle text format. Strikethrough, underline, and link are not supported.
   * @return value or {@code null} for none
   */
  public TextFormat getSubtitleTextFormat() {
    return subtitleTextFormat;
  }

  /**
   * The subtitle text format. Strikethrough, underline, and link are not supported.
   * @param subtitleTextFormat subtitleTextFormat or {@code null} for none
   */
  public ChartSpec setSubtitleTextFormat(TextFormat subtitleTextFormat) {
    this.subtitleTextFormat = subtitleTextFormat;
    return this;
  }

  /**
   * The subtitle text position. This field is optional.
   * @return value or {@code null} for none
   */
  public TextPosition getSubtitleTextPosition() {
    return subtitleTextPosition;
  }

  /**
   * The subtitle text position. This field is optional.
   * @param subtitleTextPosition subtitleTextPosition or {@code null} for none
   */
  public ChartSpec setSubtitleTextPosition(TextPosition subtitleTextPosition) {
    this.subtitleTextPosition = subtitleTextPosition;
    return this;
  }

  /**
   * The title of the chart.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the chart.
   * @param title title or {@code null} for none
   */
  public ChartSpec setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The title text format. Strikethrough, underline, and link are not supported.
   * @return value or {@code null} for none
   */
  public TextFormat getTitleTextFormat() {
    return titleTextFormat;
  }

  /**
   * The title text format. Strikethrough, underline, and link are not supported.
   * @param titleTextFormat titleTextFormat or {@code null} for none
   */
  public ChartSpec setTitleTextFormat(TextFormat titleTextFormat) {
    this.titleTextFormat = titleTextFormat;
    return this;
  }

  /**
   * The title text position. This field is optional.
   * @return value or {@code null} for none
   */
  public TextPosition getTitleTextPosition() {
    return titleTextPosition;
  }

  /**
   * The title text position. This field is optional.
   * @param titleTextPosition titleTextPosition or {@code null} for none
   */
  public ChartSpec setTitleTextPosition(TextPosition titleTextPosition) {
    this.titleTextPosition = titleTextPosition;
    return this;
  }

  /**
   * A treemap chart specification.
   * @return value or {@code null} for none
   */
  public TreemapChartSpec getTreemapChart() {
    return treemapChart;
  }

  /**
   * A treemap chart specification.
   * @param treemapChart treemapChart or {@code null} for none
   */
  public ChartSpec setTreemapChart(TreemapChartSpec treemapChart) {
    this.treemapChart = treemapChart;
    return this;
  }

  /**
   * A waterfall chart specification.
   * @return value or {@code null} for none
   */
  public WaterfallChartSpec getWaterfallChart() {
    return waterfallChart;
  }

  /**
   * A waterfall chart specification.
   * @param waterfallChart waterfallChart or {@code null} for none
   */
  public ChartSpec setWaterfallChart(WaterfallChartSpec waterfallChart) {
    this.waterfallChart = waterfallChart;
    return this;
  }

  @Override
  public ChartSpec set(String fieldName, Object value) {
    return (ChartSpec) super.set(fieldName, value);
  }

  @Override
  public ChartSpec clone() {
    return (ChartSpec) super.clone();
  }

}
