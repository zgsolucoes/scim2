/*
 * Copyright 2015-2016 UnboundID Corp.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPLv2 only)
 * or the terms of the GNU Lesser General Public License (LGPLv2.1 only)
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 */

package com.unboundid.scim2.common.types;

import com.unboundid.scim2.common.annotations.Attribute;

/**
 * Phone number for the user.
 */
public class PhoneNumber
{
  @Attribute(description = "Phone number of the User",
      isRequired = false,
      isCaseExact = false,
      mutability = AttributeDefinition.Mutability.READ_WRITE,
      returned = AttributeDefinition.Returned.DEFAULT,
      uniqueness = AttributeDefinition.Uniqueness.NONE)
  private String value;

  @Attribute(description = "A human readable name, primarily used for " +
      "display purposes.",
      isRequired = false,
      isCaseExact = false,
      mutability = AttributeDefinition.Mutability.READ_WRITE,
      returned = AttributeDefinition.Returned.DEFAULT,
      uniqueness = AttributeDefinition.Uniqueness.NONE)
  private String display;

  @Attribute(description = "A label indicating the attribute's " +
      "function; e.g., 'work' or 'home' or 'mobile' etc.",
      isRequired = false,
      isCaseExact = false,
      canonicalValues = { "work", "home", "mobile", "fax", "pager", "other" },
      mutability = AttributeDefinition.Mutability.READ_WRITE,
      returned = AttributeDefinition.Returned.DEFAULT,
      uniqueness = AttributeDefinition.Uniqueness.NONE)
  private String type;

  @Attribute(description = "A Boolean value indicating the 'primary' " +
      "or preferred attribute value for this attribute, e.g., the " +
      "preferred phone number or primary phone number. The primary " +
      "attribute value 'true' MUST appear no more than once.",
      isRequired = false,
      mutability = AttributeDefinition.Mutability.READ_WRITE,
      returned = AttributeDefinition.Returned.DEFAULT)
  private Boolean primary;

  /**
   * Retrieves the phone number of the User.
   *
   * @return The phone number of the User.
   */
  public String getValue()
  {
    return value;
  }

  /**
   * Specifies the phone number of the User.
   *
   * @param value The phone number of the User.
   * @return This object.
   */
  public PhoneNumber setValue(final String value)
  {
    this.value = value;
    return this;
  }

  /**
   * Specifies the display name, primarily used for display purposes.
   *
   * @return The display name.
   */
  public String getDisplay()
  {
    return display;
  }

  /**
   * Specifies the display name, primarily used for display purposes.
   *
   * @param display The display name.
   * @return This object.
   */
  public PhoneNumber setDisplay(final String display)
  {
    this.display = display;
    return this;
  }

  /**
   * Retrieves the label indicating the attribute's function.
   *
   * @return The label indicating the attribute's function.
   */
  public String getType()
  {
    return type;
  }

  /**
   * Specifies the label indicating the attribute's function.
   *
   * @param type The label indicating the attribute's function.
   * @return This object.
   */
  public PhoneNumber setType(final String type)
  {
    this.type = type;
    return this;
  }

  /**
   * Retrieves the Boolean value indicating the 'primary' or preferred
   * attribute value for this attribute.
   *
   * @return The Boolean value indicating the 'primary' or preferred
   * attribute value for this attribute.
   */
  public Boolean getPrimary()
  {
    return primary;
  }

  /**
   * Specifies the Boolean value indicating the 'primary' or preferred
   * attribute value for this attribute.
   *
   * @param primary The Boolean value indicating the 'primary' or preferred
   * attribute value for this attribute.
   * @return This object.
   */
  public PhoneNumber setPrimary(final Boolean primary)
  {
    this.primary = primary;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(final Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }

    PhoneNumber that = (PhoneNumber) o;

    if (value != null ? !value.equals(that.value) : that.value != null)
    {
      return false;
    }
    if (display != null ? !display.equals(that.display) : that.display != null)
    {
      return false;
    }
    if (type != null ? !type.equals(that.type) : that.type != null)
    {
      return false;
    }
    return !(primary != null ? !primary.equals(that.primary) :
        that.primary != null);

  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode()
  {
    int result = value != null ? value.hashCode() : 0;
    result = 31 * result + (display != null ? display.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (primary != null ? primary.hashCode() : 0);
    return result;
  }
}
