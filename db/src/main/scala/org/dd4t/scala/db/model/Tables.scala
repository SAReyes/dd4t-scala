package org.dd4t.scala.db.model
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.H2Driver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  implicit def string2BigDecimal(value: String) = new scala.math.BigDecimal(new java.math.BigDecimal(value))

  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  /** Row type of table Binary */
  type BinaryRow = (scala.math.BigDecimal, scala.math.BigDecimal, String)
  /** Constructor for BinaryRow providing default values if available in the database schema. */
  def BinaryRow(itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, `type`: String): BinaryRow = {
    (itemReferenceId, publicationId, `type`)
  }
  /** Table description of table BINARY. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Binary(_tableTag: Tag) extends Table[BinaryRow](_tableTag, "BINARY") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column TYPE SqlType(VARCHAR), Length(255,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("TYPE", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table Binary */
  lazy val Binary = new TableQuery(tag => new Binary(tag))

  /** Row type of table BinaryContent */
  type BinaryContentRow = (scala.math.BigDecimal, scala.math.BigDecimal, String, java.sql.Blob)
  /** Constructor for BinaryContentRow providing default values if available in the database schema. */
  def BinaryContentRow(publicationId: scala.math.BigDecimal, binaryId: scala.math.BigDecimal, variantId: String = "[#def#]", content: java.sql.Blob): BinaryContentRow = {
    (publicationId, binaryId, variantId, content)
  }
  /** Table description of table BINARY_CONTENT. Objects of this class serve as prototypes for rows in queries. */
  class BinaryContent(_tableTag: Tag) extends Table[BinaryContentRow](_tableTag, "BINARY_CONTENT") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column BINARY_ID SqlType(DECIMAL) */
    val binaryId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("BINARY_ID")
    /** Database column VARIANT_ID SqlType(VARCHAR), Length(128,true), Default([#def#]) */
    val variantId: Rep[String] = column[String]("VARIANT_ID", O.Length(128,varying=true), O.Default("[#def#]"))
    /** Database column CONTENT SqlType(BLOB) */
    val content: Rep[java.sql.Blob] = column[java.sql.Blob]("CONTENT")
  }
  /** Collection-like TableQuery object for table BinaryContent */
  lazy val BinaryContent = new TableQuery(tag => new BinaryContent(tag))

  /** Row type of table Binaryvariants */
  type BinaryvariantsRow = (scala.math.BigDecimal, scala.math.BigDecimal, String, String, Option[String], scala.math.BigDecimal, Option[String], String)
  /** Constructor for BinaryvariantsRow providing default values if available in the database schema. */
  def BinaryvariantsRow(publicationId: scala.math.BigDecimal, binaryId: scala.math.BigDecimal, variantId: String = "[#def#]", path: String, description: Option[String] = Some(" "), isComponent: scala.math.BigDecimal = "0", url: Option[String], `type`: String): BinaryvariantsRow = {
    (publicationId, binaryId, variantId, path, description, isComponent, url, `type`)
  }
  /** Table description of table BINARYVARIANTS. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Binaryvariants(_tableTag: Tag) extends Table[BinaryvariantsRow](_tableTag, "BINARYVARIANTS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column BINARY_ID SqlType(DECIMAL) */
    val binaryId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("BINARY_ID")
    /** Database column VARIANT_ID SqlType(VARCHAR), Length(128,true), Default([#def#]) */
    val variantId: Rep[String] = column[String]("VARIANT_ID", O.Length(128,varying=true), O.Default("[#def#]"))
    /** Database column PATH SqlType(VARCHAR), Length(510,true) */
    val path: Rep[String] = column[String]("PATH", O.Length(510,varying=true))
    /** Database column DESCRIPTION SqlType(VARCHAR), Length(510,true), Default(Some( )) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(510,varying=true), O.Default(Some(" ")))
    /** Database column IS_COMPONENT SqlType(DECIMAL), Default(0) */
    val isComponent: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("IS_COMPONENT", O.Default("0"))
    /** Database column URL SqlType(VARCHAR), Length(510,true) */
    val url: Rep[Option[String]] = column[Option[String]]("URL", O.Length(510,varying=true))
    /** Database column TYPE SqlType(VARCHAR), Length(255,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("TYPE", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table Binaryvariants */
  lazy val Binaryvariants = new TableQuery(tag => new Binaryvariants(tag))

  /** Row type of table Component */
  type ComponentRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal)
  /** Constructor for ComponentRow providing default values if available in the database schema. */
  def ComponentRow(itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, schemaId: scala.math.BigDecimal, isMultimedia: scala.math.BigDecimal = "0"): ComponentRow = {
    (itemReferenceId, publicationId, schemaId, isMultimedia)
  }
  /** Table description of table COMPONENT. Objects of this class serve as prototypes for rows in queries. */
  class Component(_tableTag: Tag) extends Table[ComponentRow](_tableTag, "COMPONENT") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column SCHEMA_ID SqlType(DECIMAL) */
    val schemaId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("SCHEMA_ID")
    /** Database column IS_MULTIMEDIA SqlType(DECIMAL), Default(0) */
    val isMultimedia: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("IS_MULTIMEDIA", O.Default("0"))
  }
  /** Collection-like TableQuery object for table Component */
  lazy val Component = new TableQuery(tag => new Component(tag))

  /** Row type of table ComponentPresentations */
  type ComponentPresentationsRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, java.sql.Blob)
  /** Constructor for ComponentPresentationsRow providing default values if available in the database schema. */
  def ComponentPresentationsRow(publicationId: scala.math.BigDecimal, componentId: scala.math.BigDecimal, templateId: scala.math.BigDecimal, content: java.sql.Blob): ComponentPresentationsRow = {
    (publicationId, componentId, templateId, content)
  }
  /** Table description of table COMPONENT_PRESENTATIONS. Objects of this class serve as prototypes for rows in queries. */
  class ComponentPresentations(_tableTag: Tag) extends Table[ComponentPresentationsRow](_tableTag, "COMPONENT_PRESENTATIONS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column COMPONENT_ID SqlType(DECIMAL) */
    val componentId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_ID")
    /** Database column TEMPLATE_ID SqlType(DECIMAL) */
    val templateId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("TEMPLATE_ID")
    /** Database column CONTENT SqlType(BLOB) */
    val content: Rep[java.sql.Blob] = column[java.sql.Blob]("CONTENT")
  }
  /** Collection-like TableQuery object for table ComponentPresentations */
  lazy val ComponentPresentations = new TableQuery(tag => new ComponentPresentations(tag))

  /** Row type of table ComponentPresMetaData */
  type ComponentPresMetaDataRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, String, Option[String])
  /** Constructor for ComponentPresMetaDataRow providing default values if available in the database schema. */
  def ComponentPresMetaDataRow(publicationId: scala.math.BigDecimal, componentRefId: scala.math.BigDecimal, componentTemplateId: scala.math.BigDecimal, componentOutputFormat: String, encoding: Option[String]): ComponentPresMetaDataRow = {
    (publicationId, componentRefId, componentTemplateId, componentOutputFormat, encoding)
  }
  /** Table description of table COMPONENT_PRES_META_DATA. Objects of this class serve as prototypes for rows in queries. */
  class ComponentPresMetaData(_tableTag: Tag) extends Table[ComponentPresMetaDataRow](_tableTag, "COMPONENT_PRES_META_DATA") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column COMPONENT_REF_ID SqlType(DECIMAL) */
    val componentRefId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_REF_ID")
    /** Database column COMPONENT_TEMPLATE_ID SqlType(DECIMAL) */
    val componentTemplateId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_TEMPLATE_ID")
    /** Database column COMPONENT_OUTPUT_FORMAT SqlType(VARCHAR), Length(25,true) */
    val componentOutputFormat: Rep[String] = column[String]("COMPONENT_OUTPUT_FORMAT", O.Length(25,varying=true))
    /** Database column ENCODING SqlType(VARCHAR), Length(50,true) */
    val encoding: Rep[Option[String]] = column[Option[String]]("ENCODING", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table ComponentPresMetaData */
  lazy val ComponentPresMetaData = new TableQuery(tag => new ComponentPresMetaData(tag))

  /** Row type of table CustomMeta */
  type CustomMetaRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, String, scala.math.BigDecimal, Option[java.sql.Timestamp], Option[String], Option[scala.math.BigDecimal])
  /** Constructor for CustomMetaRow providing default values if available in the database schema. */
  def CustomMetaRow(customMetaValueId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, itemId: scala.math.BigDecimal, itemType: scala.math.BigDecimal, keyName: String, keyType: scala.math.BigDecimal, keyDateValue: Option[java.sql.Timestamp], keyStringValue: Option[String], keyFloatValue: Option[scala.math.BigDecimal]): CustomMetaRow = {
    (customMetaValueId, publicationId, itemId, itemType, keyName, keyType, keyDateValue, keyStringValue, keyFloatValue)
  }
  /** Table description of table CUSTOM_META. Objects of this class serve as prototypes for rows in queries. */
  class CustomMeta(_tableTag: Tag) extends Table[CustomMetaRow](_tableTag, "CUSTOM_META") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column CUSTOM_META_VALUE_ID SqlType(DECIMAL) */
    val customMetaValueId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("CUSTOM_META_VALUE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column ITEM_ID SqlType(DECIMAL) */
    val itemId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_ID")
    /** Database column ITEM_TYPE SqlType(DECIMAL) */
    val itemType: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_TYPE")
    /** Database column KEY_NAME SqlType(VARCHAR), Length(255,true) */
    val keyName: Rep[String] = column[String]("KEY_NAME", O.Length(255,varying=true))
    /** Database column KEY_TYPE SqlType(DECIMAL) */
    val keyType: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("KEY_TYPE")
    /** Database column KEY_DATE_VALUE SqlType(TIMESTAMP) */
    val keyDateValue: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("KEY_DATE_VALUE")
    /** Database column KEY_STRING_VALUE SqlType(VARCHAR), Length(4000,true) */
    val keyStringValue: Rep[Option[String]] = column[Option[String]]("KEY_STRING_VALUE", O.Length(4000,varying=true))
    /** Database column KEY_FLOAT_VALUE SqlType(DECIMAL) */
    val keyFloatValue: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("KEY_FLOAT_VALUE")
  }
  /** Collection-like TableQuery object for table CustomMeta */
  lazy val CustomMeta = new TableQuery(tag => new CustomMeta(tag))

  /** Row type of table DynamicLinks */
  type DynamicLinksRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal)
  /** Constructor for DynamicLinksRow providing default values if available in the database schema. */
  def DynamicLinksRow(srcPubId: scala.math.BigDecimal, srcItemId: scala.math.BigDecimal, srcItemType: scala.math.BigDecimal, dstPubId: scala.math.BigDecimal, dstItemId: scala.math.BigDecimal, dstItemType: scala.math.BigDecimal): DynamicLinksRow = {
    (srcPubId, srcItemId, srcItemType, dstPubId, dstItemId, dstItemType)
  }
  /** Table description of table DYNAMIC_LINKS. Objects of this class serve as prototypes for rows in queries. */
  class DynamicLinks(_tableTag: Tag) extends Table[DynamicLinksRow](_tableTag, "DYNAMIC_LINKS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column SRC_PUB_ID SqlType(DECIMAL) */
    val srcPubId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("SRC_PUB_ID")
    /** Database column SRC_ITEM_ID SqlType(DECIMAL) */
    val srcItemId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("SRC_ITEM_ID")
    /** Database column SRC_ITEM_TYPE SqlType(DECIMAL) */
    val srcItemType: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("SRC_ITEM_TYPE")
    /** Database column DST_PUB_ID SqlType(DECIMAL) */
    val dstPubId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("DST_PUB_ID")
    /** Database column DST_ITEM_ID SqlType(DECIMAL) */
    val dstItemId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("DST_ITEM_ID")
    /** Database column DST_ITEM_TYPE SqlType(DECIMAL) */
    val dstItemType: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("DST_ITEM_TYPE")
  }
  /** Collection-like TableQuery object for table DynamicLinks */
  lazy val DynamicLinks = new TableQuery(tag => new DynamicLinks(tag))

  /** Row type of table ExtensionData */
  type ExtensionDataRow = (Int, String, java.sql.Clob)
  /** Constructor for ExtensionDataRow providing default values if available in the database schema. */
  def ExtensionDataRow(publicationId: Int, objectKey: String, content: java.sql.Clob): ExtensionDataRow = {
    (publicationId, objectKey, content)
  }
  /** Table description of table EXTENSION_DATA. Objects of this class serve as prototypes for rows in queries. */
  class ExtensionData(_tableTag: Tag) extends Table[ExtensionDataRow](_tableTag, "EXTENSION_DATA") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(INTEGER) */
    val publicationId: Rep[Int] = column[Int]("PUBLICATION_ID")
    /** Database column OBJECT_KEY SqlType(VARCHAR), Length(290,true) */
    val objectKey: Rep[String] = column[String]("OBJECT_KEY", O.Length(290,varying=true))
    /** Database column CONTENT SqlType(CLOB) */
    val content: Rep[java.sql.Clob] = column[java.sql.Clob]("CONTENT")
  }
  /** Collection-like TableQuery object for table ExtensionData */
  lazy val ExtensionData = new TableQuery(tag => new ExtensionData(tag))

  /** Row type of table ItemCategoriesAndKeywords */
  type ItemCategoriesAndKeywordsRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, String, String, scala.math.BigDecimal)
  /** Constructor for ItemCategoriesAndKeywordsRow providing default values if available in the database schema. */
  def ItemCategoriesAndKeywordsRow(relationId: scala.math.BigDecimal, itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, taxonomyId: scala.math.BigDecimal = "-1", keywordId: scala.math.BigDecimal = "-1", category: String, keyword: String, taxfacetType: scala.math.BigDecimal): ItemCategoriesAndKeywordsRow = {
    (relationId, itemReferenceId, publicationId, taxonomyId, keywordId, category, keyword, taxfacetType)
  }
  /** Table description of table ITEM_CATEGORIES_AND_KEYWORDS. Objects of this class serve as prototypes for rows in queries. */
  class ItemCategoriesAndKeywords(_tableTag: Tag) extends Table[ItemCategoriesAndKeywordsRow](_tableTag, "ITEM_CATEGORIES_AND_KEYWORDS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column RELATION_ID SqlType(DECIMAL) */
    val relationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("RELATION_ID")
    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column TAXONOMY_ID SqlType(DECIMAL), Default(-1) */
    val taxonomyId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("TAXONOMY_ID", O.Default("-1"))
    /** Database column KEYWORD_ID SqlType(DECIMAL), Default(-1) */
    val keywordId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("KEYWORD_ID", O.Default("-1"))
    /** Database column CATEGORY SqlType(VARCHAR), Length(510,true) */
    val category: Rep[String] = column[String]("CATEGORY", O.Length(510,varying=true))
    /** Database column KEYWORD SqlType(VARCHAR), Length(510,true) */
    val keyword: Rep[String] = column[String]("KEYWORD", O.Length(510,varying=true))
    /** Database column TAXFACET_TYPE SqlType(DECIMAL) */
    val taxfacetType: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("TAXFACET_TYPE")
  }
  /** Collection-like TableQuery object for table ItemCategoriesAndKeywords */
  lazy val ItemCategoriesAndKeywords = new TableQuery(tag => new ItemCategoriesAndKeywords(tag))

  /** Row type of table Items */
  type ItemsRow = (scala.math.BigDecimal, scala.math.BigDecimal, Option[scala.math.BigDecimal], Option[scala.math.BigDecimal], Option[scala.math.BigDecimal], scala.math.BigDecimal, String, Option[java.sql.Timestamp], Option[java.sql.Timestamp], Option[java.sql.Timestamp], Option[String], Option[java.sql.Timestamp], Option[String])
  /** Constructor for ItemsRow providing default values if available in the database schema. */
  def ItemsRow(itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, majorVersion: Option[scala.math.BigDecimal], minorVersion: Option[scala.math.BigDecimal], owningPublicationId: Option[scala.math.BigDecimal], itemType: scala.math.BigDecimal, title: String, creationDate: Option[java.sql.Timestamp], initialPublicationDate: Option[java.sql.Timestamp], lastPublishedDate: Option[java.sql.Timestamp], trustee: Option[String], modificationDate: Option[java.sql.Timestamp], itemSelector: Option[String]): ItemsRow = {
    (itemReferenceId, publicationId, majorVersion, minorVersion, owningPublicationId, itemType, title, creationDate, initialPublicationDate, lastPublishedDate, trustee, modificationDate, itemSelector)
  }
  /** Table description of table ITEMS. Objects of this class serve as prototypes for rows in queries. */
  class Items(_tableTag: Tag) extends Table[ItemsRow](_tableTag, "ITEMS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column MAJOR_VERSION SqlType(DECIMAL) */
    val majorVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MAJOR_VERSION")
    /** Database column MINOR_VERSION SqlType(DECIMAL) */
    val minorVersion: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("MINOR_VERSION")
    /** Database column OWNING_PUBLICATION_ID SqlType(DECIMAL) */
    val owningPublicationId: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("OWNING_PUBLICATION_ID")
    /** Database column ITEM_TYPE SqlType(DECIMAL) */
    val itemType: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_TYPE")
    /** Database column TITLE SqlType(VARCHAR), Length(510,true) */
    val title: Rep[String] = column[String]("TITLE", O.Length(510,varying=true))
    /** Database column CREATION_DATE SqlType(TIMESTAMP) */
    val creationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("CREATION_DATE")
    /** Database column INITIAL_PUBLICATION_DATE SqlType(TIMESTAMP) */
    val initialPublicationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("INITIAL_PUBLICATION_DATE")
    /** Database column LAST_PUBLISHED_DATE SqlType(TIMESTAMP) */
    val lastPublishedDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LAST_PUBLISHED_DATE")
    /** Database column TRUSTEE SqlType(VARCHAR), Length(510,true) */
    val trustee: Rep[Option[String]] = column[Option[String]]("TRUSTEE", O.Length(510,varying=true))
    /** Database column MODIFICATION_DATE SqlType(TIMESTAMP) */
    val modificationDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("MODIFICATION_DATE")
    /** Database column ITEM_SELECTOR SqlType(VARCHAR), Length(50,true) */
    val itemSelector: Rep[Option[String]] = column[Option[String]]("ITEM_SELECTOR", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table Items */
  lazy val Items = new TableQuery(tag => new Items(tag))

  /** Row type of table Keyword */
  type KeywordRow = (scala.math.BigDecimal, scala.math.BigDecimal, String)
  /** Constructor for KeywordRow providing default values if available in the database schema. */
  def KeywordRow(itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, keywordName: String): KeywordRow = {
    (itemReferenceId, publicationId, keywordName)
  }
  /** Table description of table KEYWORD. Objects of this class serve as prototypes for rows in queries. */
  class Keyword(_tableTag: Tag) extends Table[KeywordRow](_tableTag, "KEYWORD") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column KEYWORD_NAME SqlType(VARCHAR), Length(255,true) */
    val keywordName: Rep[String] = column[String]("KEYWORD_NAME", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table Keyword */
  lazy val Keyword = new TableQuery(tag => new Keyword(tag))

  /** Row type of table KeywordRelations */
  type KeywordRelationsRow = (scala.math.BigDecimal, scala.math.BigDecimal)
  /** Constructor for KeywordRelationsRow providing default values if available in the database schema. */
  def KeywordRelationsRow(node: scala.math.BigDecimal, keywordTo: scala.math.BigDecimal): KeywordRelationsRow = {
    (node, keywordTo)
  }
  /** Table description of table KEYWORD_RELATIONS. Objects of this class serve as prototypes for rows in queries. */
  class KeywordRelations(_tableTag: Tag) extends Table[KeywordRelationsRow](_tableTag, "KEYWORD_RELATIONS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column NODE SqlType(DECIMAL) */
    val node: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("NODE")
    /** Database column KEYWORD_TO SqlType(DECIMAL) */
    val keywordTo: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("KEYWORD_TO")
  }
  /** Collection-like TableQuery object for table KeywordRelations */
  lazy val KeywordRelations = new TableQuery(tag => new KeywordRelations(tag))

  /** Row type of table LinkInfo */
  type LinkInfoRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, Option[String])
  /** Constructor for LinkInfoRow providing default values if available in the database schema. */
  def LinkInfoRow(publicationId: scala.math.BigDecimal, pageId: scala.math.BigDecimal, componentId: scala.math.BigDecimal, componentTemplateId: scala.math.BigDecimal, componentTemplatePriority: scala.math.BigDecimal, componentPosition: scala.math.BigDecimal, url: Option[String]): LinkInfoRow = {
    (publicationId, pageId, componentId, componentTemplateId, componentTemplatePriority, componentPosition, url)
  }
  /** Table description of table LINK_INFO. Objects of this class serve as prototypes for rows in queries. */
  class LinkInfo(_tableTag: Tag) extends Table[LinkInfoRow](_tableTag, "LINK_INFO") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column PAGE_ID SqlType(DECIMAL) */
    val pageId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PAGE_ID")
    /** Database column COMPONENT_ID SqlType(DECIMAL) */
    val componentId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_ID")
    /** Database column COMPONENT_TEMPLATE_ID SqlType(DECIMAL) */
    val componentTemplateId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_TEMPLATE_ID")
    /** Database column COMPONENT_TEMPLATE_PRIORITY SqlType(DECIMAL) */
    val componentTemplatePriority: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_TEMPLATE_PRIORITY")
    /** Database column COMPONENT_POSITION SqlType(DECIMAL) */
    val componentPosition: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("COMPONENT_POSITION")
    /** Database column URL SqlType(VARCHAR), Length(510,true) */
    val url: Rep[Option[String]] = column[Option[String]]("URL", O.Length(510,varying=true))
  }
  /** Collection-like TableQuery object for table LinkInfo */
  lazy val LinkInfo = new TableQuery(tag => new LinkInfo(tag))

  /** Row type of table Page */
  type PageRow = (scala.math.BigDecimal, scala.math.BigDecimal, Option[String], String, Int)
  /** Constructor for PageRow providing default values if available in the database schema. */
  def PageRow(itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, filename: Option[String], url: String, templateId: Int): PageRow = {
    (itemReferenceId, publicationId, filename, url, templateId)
  }
  /** Table description of table PAGE. Objects of this class serve as prototypes for rows in queries. */
  class Page(_tableTag: Tag) extends Table[PageRow](_tableTag, "PAGE") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column FILENAME SqlType(VARCHAR), Length(255,true) */
    val filename: Rep[Option[String]] = column[Option[String]]("FILENAME", O.Length(255,varying=true))
    /** Database column URL SqlType(VARCHAR), Length(255,true) */
    val url: Rep[String] = column[String]("URL", O.Length(255,varying=true))
    /** Database column TEMPLATE_ID SqlType(INTEGER) */
    val templateId: Rep[Int] = column[Int]("TEMPLATE_ID")
  }
  /** Collection-like TableQuery object for table Page */
  lazy val Page = new TableQuery(tag => new Page(tag))

  /** Row type of table PageContent */
  type PageContentRow = (scala.math.BigDecimal, scala.math.BigDecimal, java.sql.Clob, Option[String])
  /** Constructor for PageContentRow providing default values if available in the database schema. */
  def PageContentRow(publicationId: scala.math.BigDecimal, pageId: scala.math.BigDecimal, content: java.sql.Clob, charset: Option[String]): PageContentRow = {
    (publicationId, pageId, content, charset)
  }
  /** Table description of table PAGE_CONTENT. Objects of this class serve as prototypes for rows in queries. */
  class PageContent(_tableTag: Tag) extends Table[PageContentRow](_tableTag, "PAGE_CONTENT") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column PAGE_ID SqlType(DECIMAL) */
    val pageId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PAGE_ID")
    /** Database column CONTENT SqlType(CLOB) */
    val content: Rep[java.sql.Clob] = column[java.sql.Clob]("CONTENT")
    /** Database column CHARSET SqlType(VARCHAR), Length(40,true) */
    val charset: Rep[Option[String]] = column[Option[String]]("CHARSET", O.Length(40,varying=true))
  }
  /** Collection-like TableQuery object for table PageContent */
  lazy val PageContent = new TableQuery(tag => new PageContent(tag))

  /** Row type of table PreviewSessionItems */
  type PreviewSessionItemsRow = (String, String, String, Option[java.sql.Clob], scala.math.BigDecimal, scala.math.BigDecimal)
  /** Constructor for PreviewSessionItemsRow providing default values if available in the database schema. */
  def PreviewSessionItemsRow(previewSessionId: String, previewSessionObjectKey: String, instanceName: String, filepath: Option[java.sql.Clob], changedOnDisk: scala.math.BigDecimal = "0", state: scala.math.BigDecimal): PreviewSessionItemsRow = {
    (previewSessionId, previewSessionObjectKey, instanceName, filepath, changedOnDisk, state)
  }
  /** Table description of table PREVIEW_SESSION_ITEMS. Objects of this class serve as prototypes for rows in queries. */
  class PreviewSessionItems(_tableTag: Tag) extends Table[PreviewSessionItemsRow](_tableTag, "PREVIEW_SESSION_ITEMS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PREVIEW_SESSION_ID SqlType(VARCHAR), Length(50,true) */
    val previewSessionId: Rep[String] = column[String]("PREVIEW_SESSION_ID", O.Length(50,varying=true))
    /** Database column PREVIEW_SESSION_OBJECT_KEY SqlType(VARCHAR), Length(290,true) */
    val previewSessionObjectKey: Rep[String] = column[String]("PREVIEW_SESSION_OBJECT_KEY", O.Length(290,varying=true))
    /** Database column INSTANCE_NAME SqlType(VARCHAR), Length(100,true) */
    val instanceName: Rep[String] = column[String]("INSTANCE_NAME", O.Length(100,varying=true))
    /** Database column FILEPATH SqlType(CLOB) */
    val filepath: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("FILEPATH")
    /** Database column CHANGED_ON_DISK SqlType(DECIMAL), Default(0) */
    val changedOnDisk: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("CHANGED_ON_DISK", O.Default("0"))
    /** Database column STATE SqlType(DECIMAL) */
    val state: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("STATE")
  }
  /** Collection-like TableQuery object for table PreviewSessionItems */
  lazy val PreviewSessionItems = new TableQuery(tag => new PreviewSessionItems(tag))

  /** Row type of table PreviewSessions */
  type PreviewSessionsRow = (String, java.sql.Timestamp)
  /** Constructor for PreviewSessionsRow providing default values if available in the database schema. */
  def PreviewSessionsRow(previewSessionId: String, expirationDate: java.sql.Timestamp): PreviewSessionsRow = {
    (previewSessionId, expirationDate)
  }
  /** Table description of table PREVIEW_SESSIONS. Objects of this class serve as prototypes for rows in queries. */
  class PreviewSessions(_tableTag: Tag) extends Table[PreviewSessionsRow](_tableTag, "PREVIEW_SESSIONS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PREVIEW_SESSION_ID SqlType(VARCHAR), Length(50,true) */
    val previewSessionId: Rep[String] = column[String]("PREVIEW_SESSION_ID", O.Length(50,varying=true))
    /** Database column EXPIRATION_DATE SqlType(TIMESTAMP) */
    val expirationDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("EXPIRATION_DATE")
  }
  /** Collection-like TableQuery object for table PreviewSessions */
  lazy val PreviewSessions = new TableQuery(tag => new PreviewSessions(tag))

  /** Row type of table PublicationMappings */
  type PublicationMappingsRow = (Int, Int, String)
  /** Constructor for PublicationMappingsRow providing default values if available in the database schema. */
  def PublicationMappingsRow(virtualPublicationId: Int, realPublicationId: Int, mappingKey: String): PublicationMappingsRow = {
    (virtualPublicationId, realPublicationId, mappingKey)
  }
  /** Table description of table PUBLICATION_MAPPINGS. Objects of this class serve as prototypes for rows in queries. */
  class PublicationMappings(_tableTag: Tag) extends Table[PublicationMappingsRow](_tableTag, "PUBLICATION_MAPPINGS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column VIRTUAL_PUBLICATION_ID SqlType(INTEGER) */
    val virtualPublicationId: Rep[Int] = column[Int]("VIRTUAL_PUBLICATION_ID")
    /** Database column REAL_PUBLICATION_ID SqlType(INTEGER) */
    val realPublicationId: Rep[Int] = column[Int]("REAL_PUBLICATION_ID")
    /** Database column MAPPING_KEY SqlType(VARCHAR), Length(50,true) */
    val mappingKey: Rep[String] = column[String]("MAPPING_KEY", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table PublicationMappings */
  lazy val PublicationMappings = new TableQuery(tag => new PublicationMappings(tag))

  /** Row type of table Publications */
  type PublicationsRow = (Int, Option[String], Option[String], Option[String], Option[String], Option[String], Option[String])
  /** Constructor for PublicationsRow providing default values if available in the database schema. */
  def PublicationsRow(publicationId: Int, publicationTitle: Option[String], publicationKey: Option[String], publicationPath: Option[String], publicationUrl: Option[String], multimediaPath: Option[String], multimediaUrl: Option[String]): PublicationsRow = {
    (publicationId, publicationTitle, publicationKey, publicationPath, publicationUrl, multimediaPath, multimediaUrl)
  }
  /** Table description of table PUBLICATIONS. Objects of this class serve as prototypes for rows in queries. */
  class Publications(_tableTag: Tag) extends Table[PublicationsRow](_tableTag, "PUBLICATIONS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(INTEGER) */
    val publicationId: Rep[Int] = column[Int]("PUBLICATION_ID")
    /** Database column PUBLICATION_TITLE SqlType(VARCHAR), Length(255,true) */
    val publicationTitle: Rep[Option[String]] = column[Option[String]]("PUBLICATION_TITLE", O.Length(255,varying=true))
    /** Database column PUBLICATION_KEY SqlType(VARCHAR), Length(255,true) */
    val publicationKey: Rep[Option[String]] = column[Option[String]]("PUBLICATION_KEY", O.Length(255,varying=true))
    /** Database column PUBLICATION_PATH SqlType(VARCHAR), Length(255,true) */
    val publicationPath: Rep[Option[String]] = column[Option[String]]("PUBLICATION_PATH", O.Length(255,varying=true))
    /** Database column PUBLICATION_URL SqlType(VARCHAR), Length(255,true) */
    val publicationUrl: Rep[Option[String]] = column[Option[String]]("PUBLICATION_URL", O.Length(255,varying=true))
    /** Database column MULTIMEDIA_PATH SqlType(VARCHAR), Length(255,true) */
    val multimediaPath: Rep[Option[String]] = column[Option[String]]("MULTIMEDIA_PATH", O.Length(255,varying=true))
    /** Database column MULTIMEDIA_URL SqlType(VARCHAR), Length(255,true) */
    val multimediaUrl: Rep[Option[String]] = column[Option[String]]("MULTIMEDIA_URL", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table Publications */
  lazy val Publications = new TableQuery(tag => new Publications(tag))

  /** Row type of table ReferenceEntries */
  type ReferenceEntriesRow = (scala.math.BigDecimal, String, String)
  /** Constructor for ReferenceEntriesRow providing default values if available in the database schema. */
  def ReferenceEntriesRow(publicationId: scala.math.BigDecimal, referencedUri: String, referencingUri: String): ReferenceEntriesRow = {
    (publicationId, referencedUri, referencingUri)
  }
  /** Table description of table REFERENCE_ENTRIES. Objects of this class serve as prototypes for rows in queries. */
  class ReferenceEntries(_tableTag: Tag) extends Table[ReferenceEntriesRow](_tableTag, "REFERENCE_ENTRIES") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column REFERENCED_URI SqlType(VARCHAR), Length(440,true) */
    val referencedUri: Rep[String] = column[String]("REFERENCED_URI", O.Length(440,varying=true))
    /** Database column REFERENCING_URI SqlType(VARCHAR), Length(440,true) */
    val referencingUri: Rep[String] = column[String]("REFERENCING_URI", O.Length(440,varying=true))
  }
  /** Collection-like TableQuery object for table ReferenceEntries */
  lazy val ReferenceEntries = new TableQuery(tag => new ReferenceEntries(tag))

  /** Row type of table Schemas */
  type SchemasRow = (scala.math.BigDecimal, scala.math.BigDecimal, Option[String], java.sql.Clob)
  /** Constructor for SchemasRow providing default values if available in the database schema. */
  def SchemasRow(publicationId: scala.math.BigDecimal, schemaId: scala.math.BigDecimal, title: Option[String], content: java.sql.Clob): SchemasRow = {
    (publicationId, schemaId, title, content)
  }
  /** Table description of table SCHEMAS. Objects of this class serve as prototypes for rows in queries. */
  class Schemas(_tableTag: Tag) extends Table[SchemasRow](_tableTag, "SCHEMAS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column SCHEMA_ID SqlType(DECIMAL) */
    val schemaId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("SCHEMA_ID")
    /** Database column TITLE SqlType(VARCHAR), Length(510,true) */
    val title: Rep[Option[String]] = column[Option[String]]("TITLE", O.Length(510,varying=true))
    /** Database column CONTENT SqlType(CLOB) */
    val content: Rep[java.sql.Clob] = column[java.sql.Clob]("CONTENT")
  }
  /** Collection-like TableQuery object for table Schemas */
  lazy val Schemas = new TableQuery(tag => new Schemas(tag))

  /** Row type of table Taxfacets */
  type TaxfacetsRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, String, Option[String], Option[String], Option[String], scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, String, scala.math.BigDecimal, scala.math.BigDecimal)
  /** Constructor for TaxfacetsRow providing default values if available in the database schema. */
  def TaxfacetsRow(nodeId: scala.math.BigDecimal, facetId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, taxonomyId: scala.math.BigDecimal, facetName: String, facetDescription: Option[String], facetKey: Option[String], facetParent: Option[String], facetIsabstract: scala.math.BigDecimal, facetIsnavigable: scala.math.BigDecimal, facetHaschildren: scala.math.BigDecimal, facetDepth: scala.math.BigDecimal, facetLeft: scala.math.BigDecimal, facetRight: scala.math.BigDecimal, facetItemtype: scala.math.BigDecimal, itemSelector: String = "Keyword", facetIsusedforidentification: scala.math.BigDecimal = "0", totalRelateditems: scala.math.BigDecimal = "0"): TaxfacetsRow = {
    (nodeId, facetId, publicationId, taxonomyId, facetName, facetDescription, facetKey, facetParent, facetIsabstract, facetIsnavigable, facetHaschildren, facetDepth, facetLeft, facetRight, facetItemtype, itemSelector, facetIsusedforidentification, totalRelateditems)
  }
  /** Table description of table TAXFACETS. Objects of this class serve as prototypes for rows in queries. */
  class Taxfacets(_tableTag: Tag) extends Table[TaxfacetsRow](_tableTag, "TAXFACETS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column NODE_ID SqlType(DECIMAL) */
    val nodeId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("NODE_ID")
    /** Database column FACET_ID SqlType(DECIMAL) */
    val facetId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column TAXONOMY_ID SqlType(DECIMAL) */
    val taxonomyId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("TAXONOMY_ID")
    /** Database column FACET_NAME SqlType(VARCHAR), Length(255,true) */
    val facetName: Rep[String] = column[String]("FACET_NAME", O.Length(255,varying=true))
    /** Database column FACET_DESCRIPTION SqlType(VARCHAR), Length(255,true) */
    val facetDescription: Rep[Option[String]] = column[Option[String]]("FACET_DESCRIPTION", O.Length(255,varying=true))
    /** Database column FACET_KEY SqlType(VARCHAR), Length(255,true) */
    val facetKey: Rep[Option[String]] = column[Option[String]]("FACET_KEY", O.Length(255,varying=true))
    /** Database column FACET_PARENT SqlType(VARCHAR), Length(50,true) */
    val facetParent: Rep[Option[String]] = column[Option[String]]("FACET_PARENT", O.Length(50,varying=true))
    /** Database column FACET_ISABSTRACT SqlType(DECIMAL) */
    val facetIsabstract: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_ISABSTRACT")
    /** Database column FACET_ISNAVIGABLE SqlType(DECIMAL) */
    val facetIsnavigable: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_ISNAVIGABLE")
    /** Database column FACET_HASCHILDREN SqlType(DECIMAL) */
    val facetHaschildren: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_HASCHILDREN")
    /** Database column FACET_DEPTH SqlType(DECIMAL) */
    val facetDepth: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_DEPTH")
    /** Database column FACET_LEFT SqlType(DECIMAL) */
    val facetLeft: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_LEFT")
    /** Database column FACET_RIGHT SqlType(DECIMAL) */
    val facetRight: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_RIGHT")
    /** Database column FACET_ITEMTYPE SqlType(DECIMAL) */
    val facetItemtype: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_ITEMTYPE")
    /** Database column ITEM_SELECTOR SqlType(VARCHAR), Length(50,true), Default(Keyword) */
    val itemSelector: Rep[String] = column[String]("ITEM_SELECTOR", O.Length(50,varying=true), O.Default("Keyword"))
    /** Database column FACET_ISUSEDFORIDENTIFICATION SqlType(DECIMAL), Default(0) */
    val facetIsusedforidentification: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("FACET_ISUSEDFORIDENTIFICATION", O.Default("0"))
    /** Database column TOTAL_RELATEDITEMS SqlType(DECIMAL), Default(0) */
    val totalRelateditems: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("TOTAL_RELATEDITEMS", O.Default("0"))
  }
  /** Collection-like TableQuery object for table Taxfacets */
  lazy val Taxfacets = new TableQuery(tag => new Taxfacets(tag))

  /** Row type of table TdsDbInfo */
  type TdsDbInfoRow = (Option[String], Option[String], Option[String], Option[String], Option[String])
  /** Constructor for TdsDbInfoRow providing default values if available in the database schema. */
  def TdsDbInfoRow(dbVersion: Option[String], description: Option[String], installationType: Option[String], lastModified: Option[String], modifiedBy: Option[String]): TdsDbInfoRow = {
    (dbVersion, description, installationType, lastModified, modifiedBy)
  }
  /** Table description of table TDS_DB_INFO. Objects of this class serve as prototypes for rows in queries. */
  class TdsDbInfo(_tableTag: Tag) extends Table[TdsDbInfoRow](_tableTag, "TDS_DB_INFO") {
    def * = ???

    /** Database column DB_VERSION SqlType(VARCHAR), Length(510,true) */
    val dbVersion: Rep[Option[String]] = column[Option[String]]("DB_VERSION", O.Length(510,varying=true))
    /** Database column DESCRIPTION SqlType(VARCHAR), Length(510,true) */
    val description: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(510,varying=true))
    /** Database column INSTALLATION_TYPE SqlType(VARCHAR), Length(510,true) */
    val installationType: Rep[Option[String]] = column[Option[String]]("INSTALLATION_TYPE", O.Length(510,varying=true))
    /** Database column LAST_MODIFIED SqlType(VARCHAR), Length(510,true) */
    val lastModified: Rep[Option[String]] = column[Option[String]]("LAST_MODIFIED", O.Length(510,varying=true))
    /** Database column MODIFIED_BY SqlType(VARCHAR), Length(510,true) */
    val modifiedBy: Rep[Option[String]] = column[Option[String]]("MODIFIED_BY", O.Length(510,varying=true))
  }
  /** Collection-like TableQuery object for table TdsDbInfo */
  lazy val TdsDbInfo = new TableQuery(tag => new TdsDbInfo(tag))

  /** Row type of table Template */
  type TemplateRow = (scala.math.BigDecimal, scala.math.BigDecimal, scala.math.BigDecimal, String)
  /** Constructor for TemplateRow providing default values if available in the database schema. */
  def TemplateRow(itemReferenceId: scala.math.BigDecimal, publicationId: scala.math.BigDecimal, templatePriority: scala.math.BigDecimal, templateOutputFormat: String): TemplateRow = {
    (itemReferenceId, publicationId, templatePriority, templateOutputFormat)
  }
  /** Table description of table TEMPLATE. Objects of this class serve as prototypes for rows in queries. */
  class Template(_tableTag: Tag) extends Table[TemplateRow](_tableTag, "TEMPLATE") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column ITEM_REFERENCE_ID SqlType(DECIMAL) */
    val itemReferenceId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("ITEM_REFERENCE_ID")
    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column TEMPLATE_PRIORITY SqlType(DECIMAL) */
    val templatePriority: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("TEMPLATE_PRIORITY")
    /** Database column TEMPLATE_OUTPUT_FORMAT SqlType(VARCHAR), Length(64,true) */
    val templateOutputFormat: Rep[String] = column[String]("TEMPLATE_OUTPUT_FORMAT", O.Length(64,varying=true))
  }
  /** Collection-like TableQuery object for table Template */
  lazy val Template = new TableQuery(tag => new Template(tag))

  /** Row type of table UndoLog */
  type UndoLogRow = (String, String, scala.math.BigDecimal)
  /** Constructor for UndoLogRow providing default values if available in the database schema. */
  def UndoLogRow(transactionId: String, objectKey: String, undoState: scala.math.BigDecimal): UndoLogRow = {
    (transactionId, objectKey, undoState)
  }
  /** Table description of table UNDO_LOG. Objects of this class serve as prototypes for rows in queries. */
  class UndoLog(_tableTag: Tag) extends Table[UndoLogRow](_tableTag, "UNDO_LOG") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column TRANSACTION_ID SqlType(VARCHAR), Length(50,true) */
    val transactionId: Rep[String] = column[String]("TRANSACTION_ID", O.Length(50,varying=true))
    /** Database column OBJECT_KEY SqlType(VARCHAR), Length(290,true) */
    val objectKey: Rep[String] = column[String]("OBJECT_KEY", O.Length(290,varying=true))
    /** Database column UNDO_STATE SqlType(DECIMAL) */
    val undoState: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("UNDO_STATE")
  }
  /** Collection-like TableQuery object for table UndoLog */
  lazy val UndoLog = new TableQuery(tag => new UndoLog(tag))

  /** Row type of table UndoTransactions */
  type UndoTransactionsRow = (String, java.sql.Timestamp)
  /** Constructor for UndoTransactionsRow providing default values if available in the database schema. */
  def UndoTransactionsRow(transactionId: String, creationDate: java.sql.Timestamp): UndoTransactionsRow = {
    (transactionId, creationDate)
  }
  /** Table description of table UNDO_TRANSACTIONS. Objects of this class serve as prototypes for rows in queries. */
  class UndoTransactions(_tableTag: Tag) extends Table[UndoTransactionsRow](_tableTag, "UNDO_TRANSACTIONS") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column TRANSACTION_ID SqlType(VARCHAR), Length(50,true) */
    val transactionId: Rep[String] = column[String]("TRANSACTION_ID", O.Length(50,varying=true))
    /** Database column CREATION_DATE SqlType(TIMESTAMP) */
    val creationDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("CREATION_DATE")
  }
  /** Collection-like TableQuery object for table UndoTransactions */
  lazy val UndoTransactions = new TableQuery(tag => new UndoTransactions(tag))

  /** Row type of table XsltContent */
  type XsltContentRow = (scala.math.BigDecimal, scala.math.BigDecimal, java.sql.Timestamp, Option[java.sql.Clob])
  /** Constructor for XsltContentRow providing default values if available in the database schema. */
  def XsltContentRow(publicationId: scala.math.BigDecimal, xsltId: scala.math.BigDecimal, lastModified: java.sql.Timestamp, content: Option[java.sql.Clob]): XsltContentRow = {
    (publicationId, xsltId, lastModified, content)
  }
  /** Table description of table XSLT_CONTENT. Objects of this class serve as prototypes for rows in queries. */
  class XsltContent(_tableTag: Tag) extends Table[XsltContentRow](_tableTag, "XSLT_CONTENT") {
    def * = ???
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ???

    /** Database column PUBLICATION_ID SqlType(DECIMAL) */
    val publicationId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("PUBLICATION_ID")
    /** Database column XSLT_ID SqlType(DECIMAL) */
    val xsltId: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("XSLT_ID")
    /** Database column LAST_MODIFIED SqlType(TIMESTAMP) */
    val lastModified: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("LAST_MODIFIED")
    /** Database column CONTENT SqlType(CLOB) */
    val content: Rep[Option[java.sql.Clob]] = column[Option[java.sql.Clob]]("CONTENT")
  }
  /** Collection-like TableQuery object for table XsltContent */
  lazy val XsltContent = new TableQuery(tag => new XsltContent(tag))
}
