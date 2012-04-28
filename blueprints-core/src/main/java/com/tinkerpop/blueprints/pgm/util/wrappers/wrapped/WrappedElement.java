package com.tinkerpop.blueprints.pgm.util.wrappers.wrapped;

import com.tinkerpop.blueprints.pgm.Element;

import java.util.Set;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class WrappedElement implements Element {

    protected Element rawElement;

    public WrappedElement(final Element rawElement) {
        this.rawElement = rawElement;
    }

    public void setProperty(final String key, final Object value) {
        this.rawElement.setProperty(key, value);
    }

    public Object getProperty(final String key) {
        return this.rawElement.getProperty(key);
    }

    public Object removeProperty(final String key) {
        return this.rawElement.removeProperty(key);
    }

    public Set<String> getPropertyKeys() {
        return this.rawElement.getPropertyKeys();
    }

    public Object getId() {
        return this.rawElement.getId();
    }

    public boolean equals(final Object object) {
        return null != object && (object.getClass().equals(this.getClass())) && this.rawElement.getId().equals(((WrappedElement) object).getId());
    }

    public int hashCode() {
        return this.rawElement.hashCode();
    }

    public Element getRawElement() {
        return this.rawElement;
    }

    public String toString() {
        return this.rawElement.toString();
    }
}
